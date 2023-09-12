/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo.w3;

/**
 *
 * @author a
 */
import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        System.out.println(sum.toString());
        System.out.println(product.toString());

        scanner.close();
    }
}
