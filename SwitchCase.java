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
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char pilih;
        String prodi = null;
        System.out.println("Masukan pilihan (A-C): ");
        pilih = input.next().charAt(0);
        switch (pilih) {
            case 'A':
                prodi = "Informatika";
                break;
            case 'B':
                prodi = "Sistem Informasi";
                break;
            case 'C':
                prodi = "Teknik Komputer";
                break;
            default:
                System.out.println("Salah memasukan pilihan");
                break;
        }
        System.out.println("Program Studi yang anda pilih adalah " +prodi);
    }
}
