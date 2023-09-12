/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo.w2;

import java.util.Scanner;
/**
 *
 * @author a
 */
public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int lengthSum = A.length() + B.length();
        System.out.println(lengthSum);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = capitalizeFirstLetter(A);
        B = capitalizeFirstLetter(B);

        System.out.println(A + " " + B);

        scanner.close();
    }

    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
