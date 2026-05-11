/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author AoBing
 */
import java.util.Scanner;

class AngkaTerbesar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int terbesar;

        System.out.println("PROGRAM MENCARI ANGKA TERBESAR");
        System.out.println("------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Angka Ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }

        terbesar = angka[0];

        for (int i = 1; i < 5; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        System.out.println("\nData Angka Yang Diinput : ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Angka[" + i + "] = " + angka[i]);
        }

        System.out.println("\nNilai Terbesar = " + terbesar);
    }
}