/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celcius, fahrenheit, reamur;

        System.out.print("Masukan Nilai Derajat Celcius : ");
        celcius = input.nextDouble();

        fahrenheit = (9.0 / 5.0 * celcius) + 32;
        reamur = (4.0 / 5.0 * celcius);

        System.out.println("Hasil Konversi");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur     : " + reamur);
    }
}
