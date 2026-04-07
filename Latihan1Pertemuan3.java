/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.util.*;
/**
 *
 * @author Mahasiswa
 */
public class Latihan1Pertemuan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String namasiswa;
        int bil1,bil2,bil3,average;
        
        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");
        System.out.print("Masukan nama siswa: ");
        namasiswa = in.nextLine();
        System.out.print("Masukan Nilai Pertandingan 1 : ");
        bil1 = in.nextInt();
        System.out.print("Masukan Nilai Pertandingan 2 : ");
        bil2 = in.nextInt();
        System.out.print("Masukan Nilai Pertandingan 3 : ");
        bil3 = in.nextInt();
        
        average = (bil1+bil1+bil3)/3;
        
        System.out.print("Nilai Rata-Rata Adalah : " +average);
        
        if (average >= 85) {
            System.out.println (" Selamat anda mendapatkan seperangkat komputer P4");
        } else if (average >= 70 ) {
            System.out.println (" Selamat anda mendapatkan uang sebesar Rp. 500.000");
        } else
            System.out.println (" Selamat anda mendapatkan Hadiah Hiburan");
    } 
}
