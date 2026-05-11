/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius, luas, keliling;
        double phi = 3.14;

        System.out.print("Masukan Nilai Radius : ");
        radius = input.nextDouble();

        luas = phi * radius * radius;
        keliling = 2 * phi * radius;

        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran     : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}