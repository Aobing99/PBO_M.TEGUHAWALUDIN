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
public class UTSNilaiAkhirSiswa {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char ulang;

        do {

            System.out.println("PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.print("Masukkan Jumlah Mahasiswa : ");
            int jumlah = in.nextInt();

            String[] nama = new String[jumlah];
            double[] tugas = new double[jumlah];
            double[] uts = new double[jumlah];
            double[] uas = new double[jumlah];
            double[] akhir = new double[jumlah];
            char[] grade = new char[jumlah];

            for (int i = 0; i < jumlah; i++) {

                in.nextLine();

                System.out.println("\nMahasiswa Ke - " + (i + 1));

                System.out.print("Nama Mahasiswa : ");
                nama[i] = in.nextLine();

                System.out.print("Nilai Tugas : ");
                tugas[i] = in.nextDouble();

                System.out.print("Nilai UTS : ");
                uts[i] = in.nextDouble();

                System.out.print("Nilai UAS : ");
                uas[i] = in.nextDouble();

                akhir[i] = (tugas[i] * 0.30)
                        + (uts[i] * 0.30)
                        + (uas[i] * 0.40);

                if (akhir[i] >= 80) {
                    grade[i] = 'A';
                } else if (akhir[i] >= 70) {
                    grade[i] = 'B';
                } else if (akhir[i] >= 59) {
                    grade[i] = 'C';
                } else if (akhir[i] >= 50) {
                    grade[i] = 'D';
                } else {
                    grade[i] = 'E';
                }
            }

            System.out.println("\n");
            System.out.println("DAFTAR NILAI");
            System.out.println("MATERI : PEMROGRAMMAN PBO");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("No\tNama\t\tTugas\tUTS\tUAS\tAkhir\tGrade");
            System.out.println("-------------------------------------------------------------------");

            for (int i = 0; i < jumlah; i++) {

                System.out.println((i + 1) + "\t"
                        + nama[i] + "\t\t"
                        + tugas[i] + "\t"
                        + uts[i] + "\t"
                        + uas[i] + "\t"
                        + akhir[i] + "\t"
                        + grade[i]);
            }

            System.out.println("-------------------------------------------------------------------");

            System.out.print("\nIngin Mengulang Program? (Y/T) : ");
            ulang = in.next().charAt(0);

            System.out.println();

        } while (ulang == 'Y' || ulang == 'y');

    }
}