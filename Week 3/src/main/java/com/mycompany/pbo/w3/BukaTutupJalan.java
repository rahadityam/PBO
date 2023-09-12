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

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] platNomor = new int[4];
        for (int i = 0; i < 4; i++) {
            platNomor[i] = scanner.nextInt();
        }

        int combinedNumber = 0;
        for (int i = 0; i < 4; i++) {
            combinedNumber += platNomor[i];
            if (i < 3) {
                combinedNumber *= 10;
            }
        }

        if ((combinedNumber - 999999) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }

        scanner.close();
    }
}
