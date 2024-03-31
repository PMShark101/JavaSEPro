package com.pmshark;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>(); //用于存储所有的用户账户
    private Scanner sc = new Scanner(System.in); //用于接收用户输入
    private Account loginAccount; //记住登陆后的用户账户

    /**
     * 启动ATM系统 展示欢迎界面
     */
    public void start() {
        while (true) {
            System.out.println("======欢迎您进入ATM系统=======");
            System.out.println("1.用户登陆");
            System.out.println("2.用户开户");
            System.out.println("3.请选择");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登陆
                    login();
                    break;
                case 2:
                    //开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有这个选项，请重新选择");
            }
        }
    }

    /**
     * 完成用户登陆操作
     */
    private void login() {
        while (true) {
            if (accounts.size() == 0) {
                System.out.println("查询到没有用户，请先去开户！");
                return;
            }
            System.out.println("成功进入登陆页面");
            System.out.println("请输入卡号: ");
            String cardId = sc.next();

            Account account = getAccountByCardId(cardId);

            if (account == null) {
                System.out.println("卡号不存在，请重新输入");
            } else {
                while (true) {
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    if (password.equals(account.getPassword())) {
                        loginAccount = account;
                        System.out.println("恭喜， " + account.getUserName() + ", 登陆成功， 您的卡号是：" + account.getCardId());
                        //展示登陆后的操作界面
                        showUserMenu();
                        return; //跳出登陆操作
                    } else {
                        System.out.println("密码输入不正确，请重新输入");
                    }
                }
            }
        }
    }

    /**
     * 展示登陆后的操作界面
     */
    private void showUserMenu() {
        while (true) {
            System.out.println(loginAccount.getUserName() + "您可以选择如下操作：");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showAccount();
                    break;
                case 2:
                    //存款
                    saveMoney();
                    break;
                case 3:
                    //取款
                    getMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //修改密码
                    changePassword();
                    return;
                case 6:
                    //退出
                    System.out.println(loginAccount.getUserName() + "欢迎下次光临");
                    return;
                case 7:
                    //注销当前账户
                    if (deleteAccount()) {
                        return; //销户成功，跳出当前操作
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }


    /** 账户密码修改 */
    private void changePassword() {
        System.out.println("==账户密码修改操作==");
        //认证当前密码
        System.out.println("请您输入当前用户的密码：");
        String password =  sc.next();
        if (loginAccount.getPassword().equals(password)) {
            while (true) {
                System.out.println("请输入密码：");
                String password1 = sc.next();
                System.out.println("请再次输入密码：");
                String password2 = sc.next();

                if (password1.equals(password2)) {
                    loginAccount.setPassword(password1);
                    System.out.println("密码更改成功！");
                    return;
                } else {
                    System.out.println("两次密码输入不一致，请重新输入");
                }
            }
        }else {
            System.out.println("密码错误");
            return;
        }
        
    }


    /**
     * 销户操作
     */
    private boolean deleteAccount() {
        System.out.println("==销户操作==");
        System.out.println("请再次确认是否要销户？(Y/N)");
        String command = sc.next();
        switch (command) {
            case "Y":
                //销户
                //判断用户的账户中是否有余额
                if (loginAccount.getMoney() == 0) {
                    accounts.remove(loginAccount);
                    System.out.println("销户成功！");
                    return true;
                } else {
                    System.out.println("账户中还有余额，无法销户！");
                    return false;
                }
            default:
                System.out.println("销户失败！");
                return false;
        }
    }


    /**
     * 用户转账
     */
    private void transferMoney() {
        System.out.println("==用户转账==");
        if (accounts.size() < 2) {
            System.out.println("当前用户数量不足，无法转账！");
            return;
        }

        if (loginAccount.getMoney() < 100) {
            System.out.println("余额不足100，无法转账！");
            return;
        }

        while (true) {
            System.out.println("请输入对方的卡号：");
            String cardId = sc.next();

            //根据卡号查询对方账户
            Account account = getAccountByCardId(cardId);
            if (account == null) {
                System.out.println("对方卡号不存在，请重新输入！");
                return;
            } else {
                //对方账户存在，让用户继续认证对象姓氏
                String name = "*" + account.getUserName().substring(1);
                System.out.println("请输入[" + name + "]的姓氏：");
                String lastName = sc.next();
                if (account.getUserName().startsWith(lastName)) {
                    //姓氏验证通过，继续转账操作
                    while (true) {
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        if (loginAccount.getMoney() > money) {
                            //更新自己的账户余额
                            loginAccount.setMoney(loginAccount.getMoney() - money);
                            //更新对方的账户余额
                            account.setMoney(account.getMoney() + money);
                            System.out.println("恭喜!" + loginAccount.getUserName() + "转账成功!转账金额为" + money + "您目前的余额为" + loginAccount.getMoney());
                            return; //跳出转账方法
                        } else {
                            System.out.println("余额不足，转账失败！你最多只能转账" + loginAccount.getMoney() + "元。");
                        }
                    }

                } else {
                    System.out.println("姓氏验证失败，请重新输入！");
                }
            }
        }
    }

    private void getMoney() {
        //取款
        System.out.println("==取款操作==");
        while (true) {
            System.out.println("请输入取款金额：");
            if (loginAccount.getMoney() < 100) {
                System.out.println("余额不足，取款失败！");
                return;
            } else {
                double money = sc.nextDouble();
                if (money > loginAccount.getMoney()) {
                    System.out.println("余额不足，取款失败！");
                    return;
                } else {
                    loginAccount.setMoney(loginAccount.getMoney() - money);
                    System.out.println("取款成功，您已取款" + money + "元, " + "目前余额为：" + loginAccount.getMoney() + "元。");
                    break;
                }
            }
        }
    }


    private void saveMoney() {
        //存钱
        System.out.println("==存款操作==");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();

        //更新当前账户的余额
        loginAccount.setMoney(loginAccount.getMoney() + money);
        System.out.println("存款成功，您的余额是：" + loginAccount.getMoney());
    }


    /**
     * 展示当前登陆用户的账户信息
     */
    private void showAccount() {
        System.out.println("==您的账户信息如下==");
        System.out.println("卡号：" + loginAccount.getCardId());
        System.out.println("姓名：" + loginAccount.getUserName());
        System.out.println("余额：" + loginAccount.getMoney());
        System.out.println("取现额度：" + loginAccount.getLimit());
    }

    /**
     * 完成用户开户操作
     */
    private void createAccount() {
        //1.创建一个开户对象，用于封装用户的开户信息
        Account account = new Account();

        //2.需要用户输入自己的开户信息，赋值给开户对象
        System.out.println("请输入用户名：");
        account.setUserName(sc.next());

        while (true) {
            System.out.println("请输入性别");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            } else {
                System.out.println("性别输入错误，请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();

            if (password.equals(password2)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }

        System.out.println("请输入取现额度：");
        double limit = sc.nextDouble();
        account.setLimit(limit);

        //重点：系统自动生成生成卡号,卡号是唯一的
        String newCardId = createCardId();
        account.setCardId(newCardId);

        //3.将开户对象添加到集合中
        accounts.add(account);
        System.out.println("恭喜您， " + account.getUserName() + ", 开户成功, 您的卡号是：" + account.getCardId() + ", 请牢记!");
    }

    /**
     * 返回一个8位数字的卡号，并且不能重复
     */
    private String createCardId() {
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }

            //判断卡号是否重复
            Account account = getAccountByCardId(cardId);
            if (account == null) {
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询对象返回
     */
    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            //判断卡号是否一致
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null; //没有找到
    }
}
