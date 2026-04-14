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
public class NilaiAkhirSiswaPT4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String namasiswa;
        Double nk,nt,nu,na,nmk,nmt,nmu;
        
        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.print("Masukan Nama Siswa: ");
        namasiswa = in.nextLine();
        System.out.print("Masukan Nilai Keaktifan : ");
        nk = in.nextDouble();
        System.out.print("Masukan Nilai Tugas : ");
        nt = in.nextDouble();
        System.out.print("Masukan Nilai Ujian : ");
        nu = in.nextDouble();
        
        nmk = nk*0.2;
        nmt = nt*0.3;
        nmu = nu*0.5;
        
        na = nmk+nmt+nmu;
        
        System.out.println("Siswa yang bernama : "+namasiswa);
        System.out.println("Nilai Keaktifan * 20% : "+nmk);
        System.out.println("Nilai Tugas * 30% : "+nmt);
        System.out.println("Nilai Ujian * 50% : "+nmu);
        
        System.out.println("Jadi Siswa Yang Bernama " +namasiswa+ " Memperoleh Nilai Akhir Sebesar "+na);
        
        if ( na >= 80 && na<=100 ) {
            System.out.println ("Grade nilai yang didapat adalah A");
        } else if (na >= 70 && na<80 ) {
            System.out.println ("Grade nilai yang didapat adalah B");
        }else if (na >= 59 && na<70) {
            System.out.println ("Grade nilai yang didapat adalah C");
        }else if (na >= 50 && na <59) {
            System.out.println ("Grade nilai yang didapat adalah D");
        }else if (na < 50 && na >=1 ) {
            System.out.println ("Grade nilai yang didapat adalah E");
        }else
            System.out.println ("Nilai Tidak Valid");       
    }
}
