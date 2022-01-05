package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double vnd = 23000;
    double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        usd = scanner.nextDouble();
        double change = usd * 23000;
        System.out.println("Giá trị quy đổi: "+change);
    }
}
