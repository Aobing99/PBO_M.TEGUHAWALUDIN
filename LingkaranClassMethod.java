/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.Scanner;

class Lingkaran {

    double r;
    double phi = 3.14;

    double luas() {
        return phi * r * r;
    }

    double keliling() {
        return 2 * phi * r;
    }
}

public class LingkaranClassMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Lingkaran L = new Lingkaran();

        System.out.print("Masukkan Jari-jari : ");
        L.r = input.nextDouble();

        System.out.println("Luas Lingkaran = " + L.luas());
        System.out.println("Keliling Lingkaran = " + L.keliling());
    }
}