package com.pmshark;

public class Test1 {
    public static void main(String[] args) {
        /*====买飞机票====*/
        double price = calculate(1000, 8, "头等舱");
        System.out.println("优惠价是：" + price + "元");
    }

    public static double calculate(double price, int month, String type) {
        //判断淡季和旺季
        if (month >= 5 && month <= 10) {
            //旺季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济仓":
                    price *= 0.85;
                    break;
            }
        } else {
            //淡季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济仓":
                    price *= 0.85;
                    break;
            }
        }
        return price;
    }
}