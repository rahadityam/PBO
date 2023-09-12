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

public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();

        int result = 0;
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A / B;
                break;
            case "%":
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                System.exit(1);
        }

        System.out.println(result);

        scanner.close();
    }
}
