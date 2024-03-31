package com.pmshark.test;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account loginAccount;

    public void Start() {
        while (true) {
            System.out.println("=====欢迎进入ATM系统=====");
            System.out.println("请选择：");
            System.out.println("1.用户登陆");
            System.out.println("2.用户开户");
            System.out.println("3.请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登陆
                    login();
                    break;
                case 2:
                    createAccount();
                    //开户
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }

    private void login() {
        System.out.println("已进入系统登陆页面");
        if(accounts.size() == 0) {
            System.out.println("当前没有用户，请先开户！");
            return;
        }
        while (true) {
            //输入卡号
            System.out.println("请输入卡号：");
            String cardId = sc.next();

            //判断卡号是否存在
            Account account = getAccountByCardId(cardId);
            if(account == null) {
                System.out.println("卡号不存在，请重新输入！");
            }else {
                while (true) {
                    //输入密码
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    if(account.getPassword().equals(password)) {
                        loginAccount = account;
                        System.out.println("恭喜您，" + account.getUserName() + "登陆成功！您的卡号是：" + account.getCardId());
                        showUserMenu();
                        return;
                    }else {
                        System.out.println("密码错误，请重新输入！");
                    }
                }
            }
        }
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("==请选择操作功能==");
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
                    System.out.println("欢迎下次光临！");
                    return;
                case 7:
                    //注销当前账户
                    if (cancelAccount()) {
                        return;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入！"); 
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

    private boolean cancelAccount() {
        System.out.println("==注销账户==");
        System.out.println("您确定要注销账户吗？(Y/N)");
        String command = sc.next();
        switch (command) {
            case "Y":
                if (loginAccount.getMoney() == 0) {
                    accounts.remove(loginAccount);
                    System.out.println("销户成功");
                    return true;
                }else {
                    System.out.println("您的账户中还有余额，销户失败");
                    return false;
                }
            default:
                System.out.println("销户失败");
                return false;
        }
    }

    private void transferMoney() {
        System.out.println("==欢迎进入转账页面==");
        if (accounts.size() < 2) {
            System.out.println("开户账户不足2人，无法转账");
            return;
        }
        if(loginAccount.getMoney() < 100) {
            System.out.println("余额不足100，无法转账");
            return;
        }

        System.out.println("请输入对方账户卡号");
        String cardId = sc.next();
        Account account = getAccountByCardId(cardId);
        if (account == null) {
            System.out.println("账户不存在，请重新输入卡号");
            return;
        }else {
            while (true) {
                System.out.println("请输入对方[*" + account.getUserName().substring(1) + "]的姓氏:");
                String lastname = sc.next();
                if (account.getUserName().startsWith(lastname)) {
                    while (true) {
                        System.out.println("请输入转账金额");
                        double money = sc.nextDouble();
                        if(loginAccount.getMoney() >= money) {
                            loginAccount.setMoney(loginAccount.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功！" + "已经给" + account.getCardId() + "账户转账" + account.getMoney() + "元。");
                            return;
                        }else {
                            System.out.println("余额不足，转账失败");
                        }
                    }
                }else {
                    System.out.println("姓氏不正确，请重新输入");
                }
            }
        }
    }

    private void getMoney() {
        System.out.println("==取款操作==");
        if (loginAccount.getMoney() < 100) {
            System.out.println("账户余额小于100，无法取款");
            return;
        }else {
            while (true) {
                System.out.println("请输入取款金额：");
                double money = sc.nextDouble();
                if (money > loginAccount.getMoney()) {
                    System.out.println("余额不足，无法取款");
                    break;
                }else {
                    loginAccount.setMoney(loginAccount.getMoney() - money);
                    System.out.println("取款成功，" + loginAccount.getUserName() + "。您目前的余额为" + loginAccount.getMoney() + "元。");
                    break;
                }
            }
        }


    }

    private void saveMoney() {
        System.out.println("==存款操作==");
        System.out.println("请输入存款金额：");
        double money =  sc.nextDouble();
        loginAccount.setMoney(loginAccount.getMoney() + money);
        System.out.println("存款成功，您现在的余额为" + loginAccount.getMoney() + "元。");
    }

    private void showAccount() {
        System.out.println(loginAccount.getUserName() + "下面是您的用户信息");
        System.out.println("卡号：" + loginAccount.getCardId());
        System.out.println("姓名：" + loginAccount.getUserName());
        System.out.println("余额：" + loginAccount.getMoney());
        System.out.println("取现额度：" + loginAccount.getLimit());
    }

    private void createAccount() {
        Account account = new Account();
        System.out.println("请输入用户名：");
        account.setUserName(sc.next());

        while (true) {
            System.out.println("请输入性别：");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                account.setSex(sex);
                break;
            } else {
                System.out.println("输入性别有误请重新输入！");
            }
        }

        while (true) {
            System.out.println("请输入密码:");
            String password = sc.next();
            System.out.println("请再次输入密码:");
            String password2 = sc.next();

            if (password.equals(password2)) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("输入两次密码不一致，请重新输入");
            }
        }

        System.out.println("请输入取现额度");
        double limit = sc.nextDouble();
        account.setLimit(limit);

        //随机生成卡号
        String newCardId = createCardId();
        account.setCardId(newCardId);


        accounts.add(account);
        System.out.println("恭喜您, " + account.getUserName() + ", 开户成功, 您的卡号是：" + account.getCardId() + "， 请牢记！");
    }

    private String createCardId() {
        while (true) {
            String cardId = "";
            cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }

            Account account = getAccountByCardId(cardId);
            if (account == null) {
                return cardId;
            }
        }
    }


    private Account getAccountByCardId(String cardId) {
        //遍历集合，根据卡号找到对应的账户
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);

            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;
    }
}
