/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo.w3;

/**
 *
 * @author a
 */
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] tokens = input.split("[^A-Za-z]+");

        int tokenCount = 0;

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
                tokenCount++;
            }
        }

        System.out.println(tokenCount);

        scanner.close();
    }
}
