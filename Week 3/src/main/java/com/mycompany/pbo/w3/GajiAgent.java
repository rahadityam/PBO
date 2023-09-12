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

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPenjualan = scanner.nextInt();

        int gajiPokok = 500000;

        int hargaItem = 50000;

        double bonus = 0;

        if (totalPenjualan >= 40 && totalPenjualan <= 80) {
            bonus = totalPenjualan * hargaItem * 0.25;
        } else if (totalPenjualan > 80) {
            bonus = totalPenjualan * hargaItem * 0.35;
        } else if (totalPenjualan < 15) {
            int denda = (int) ((15 - totalPenjualan) * hargaItem * 0.15);
            gajiPokok -= denda;
        } else {
            bonus = totalPenjualan * hargaItem * 0.10;
        }

        int totalGaji = gajiPokok + (int) bonus;

        System.out.println(totalGaji);

        scanner.close();
    }
}
