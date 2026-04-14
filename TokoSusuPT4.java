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
public class TokoSusuPT4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char MS,UK;
        int harga = 0,totalharga,qty;
        
        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("A. Susu Dancow");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        
        System.out.println("Masukan Merk Susu [A | B | C] : ");
        MS = in.next().charAt(0);
        System.out.println("Masukan Ukuran Kaleng [1 | 2 | 3] : ");
        UK = in.next().charAt(0);
        
        switch (MS) {
            case 'A':
                switch (UK) {
                    case '1':
                        harga=25000;
                        break;
                    case '2':
                        harga=20000;
                        break;
                    case '3':
                        harga=15000;
                        break;
                }
                break;
            case 'B':
                switch (UK) {
                    case '1':
                        harga=20000;
                        break;
                    case '2':
                        harga=14500;
                        break;
                    case '3':
                        harga=13500;
                        break;
                }
                break;
            case 'C':
                switch (UK) {
                    case '1':
                        harga=22000;
                        break;
                    case '2':
                        harga=18500;
                        break;
                    case '3':
                        harga=15000;
                        break;
                }
                break;
        }
        
        
        System.out.println("Harga Satuan Barang Rp."+harga);
        System.out.println("Jumlah Yang dibeli :");
        qty = in.nextInt();
        
        totalharga = harga*qty;
        
        System.out.println("Harga yang harus dibayar sebesar Rp. "+totalharga);
        
                
        
    }
    
}
