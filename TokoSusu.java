/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

import java.util.*;

/**
 *
 * @author AoBing
 */
public class TokoSusu {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         String nama;
        double keaktifan, tugas, ujian;
        double nKeaktifan, nTugas, nUjian, nilaiAkhir;
        String grade;

        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.print("Nama Siswa : ");
        nama = in.nextLine();

        System.out.print("Nilai Keaktifan : ");
        keaktifan = in.nextDouble();

        System.out.print("Nilai Tugas : ");
        tugas = in.nextDouble();

        System.out.print("Nilai Ujian : ");
        ujian = in.nextDouble();

        nKeaktifan = keaktifan * 0.20;
        nTugas = tugas * 0.30;
        nUjian = ujian * 0.50;

        nilaiAkhir = nKeaktifan + nTugas + nUjian;

        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("\n=== HASIL ===");
        System.out.println("Siswa yang bernama " + nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan:");

        System.out.println("Nilai Keaktifan * 20% : " + nKeaktifan);
        System.out.println("Nilai Tugas * 30% : " + nTugas);
        System.out.println("Nilai Ujian * 50% : " + nUjian);

        System.out.println("\nJadi Siswa yang bernama " + nama +
                " memperoleh nilai akhir sebesar " + nilaiAkhir);

        System.out.println("Grade nilai yang didapat adalah " + grade);
    }
}
