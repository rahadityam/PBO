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

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        while (scanner.hasNext()) {
            String s = scanner.next();
            int n = scanner.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");

        scanner.close();
    }
}
