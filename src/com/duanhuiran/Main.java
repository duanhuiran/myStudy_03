package com.duanhuiran;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//// How to format the number.
//// NumberFormat' is abstract; cannot be instantiated 是抽象的，无法进行实例化。
//
////        NumberFormat currency = new NumberFormat()
//        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
////        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
//// 百分制%
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result2 = percent.format(0.13);
//        System.out.println(result2);
////连接method
//        String result3 = NumberFormat.getPercentInstance().format(11);
//        System.out.println(result3);
////How to use input from the user
////println 分行打印； print 不分行打印；
//        System.out.print("Type your age:");
//        Scanner inputAge = new Scanner(System.in);
//        byte age = inputAge.nextByte();
//        System.out.println("Your age is " + age);
//
//// 输入文本时，next()只会调用空格前的文本，nextLine()才会调用全行文本
//        System.out.print("Type your name:");
//        Scanner inputName = new Scanner(System.in);
//        String name = inputName.next();
//        System.out.println(name);
//
//        System.out.print("Type your name again:");
//        Scanner inputName2 = new Scanner(System.in);
//        // 修剪空格 .trim()
//        String name2 = inputName2.nextLine().trim();
//        System.out.println(name2);

// Practice: Mortgage Calculator 利息计算
        System.out.print("Your Principal:");
//        Scanner inputPrincipal = new Scanner(System.in);
        double Principal = new Scanner(System.in).nextDouble();

        System.out.print("Annual Interest Rate(%):");
        Scanner inputRate = new Scanner(System.in);
        double RateMonthly = inputRate.nextDouble() / 12 / 100;

        System.out.print("Period(years):");
        Scanner inputPeriod = new Scanner(System.in);
        double PeriodMonths = inputPeriod.nextDouble() * 12;

        double MortgageWithoutFormat = Principal * RateMonthly * Math.pow((1 + RateMonthly),PeriodMonths) / (Math.pow((1 + RateMonthly),PeriodMonths) - 1);
//        NumberFormat currencyUSD = NumberFormat.getCurrencyInstance(Locale.US);

        String Mortgage = NumberFormat.getCurrencyInstance(Locale.US).format(MortgageWithoutFormat);

        System.out.println("Your Mortgage is " + Mortgage + "!");

//        视频 1:36:00 除由优化写法。
//        包括：final的运用；input的简化；format的简化；
    }
}
