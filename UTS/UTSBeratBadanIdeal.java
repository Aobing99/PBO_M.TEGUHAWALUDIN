/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author AoBing
 */
public class UTSBeratBadanIdeal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ulang;

        do {

            char jk;
            int tinggi, berat, bbi, selisih;

            System.out.print("Pilih jenis kelamin (L/P) : ");
            jk = in.next().charAt(0);

            System.out.print("Masukkan tinggi badan Anda (dalam cm) : ");
            tinggi = in.nextInt();

            if (jk == 'L' || jk == 'l') {
                bbi = tinggi - 100;
            } else {
                bbi = tinggi - 110;
            }

            System.out.println("Berat badan ideal yang seharusnya : "
                    + bbi + " Kg");

            System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
            berat = in.nextInt();

            selisih = berat - bbi;

            if (berat <= bbi) {

                System.out.println("Anda termasuk kedalam kategori Kurus");
                System.out.println("Selisih berat badan Anda adalah "
                        + Math.abs(selisih) + " Kg");

            } else {

                System.out.println("Anda termasuk kedalam kategori Gemuk dan harus mengurangi berat");
                System.out.println("badan sebanyak " + selisih + " Kg (" 
                        + berat + " Kg - " + bbi + " Kg)");
            }

            System.out.print("\nIngin mengulang program? (Y/T) : ");
            ulang = in.next().charAt(0);

            System.out.println();

        } while (ulang == 'Y' || ulang == 'y');

    }
}
