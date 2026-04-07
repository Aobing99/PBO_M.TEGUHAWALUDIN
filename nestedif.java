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
public class nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int bilangan;
        System.out.print("Masukan sebuah bilangan (1-100): ");
        bilangan = in.nextInt();
        /*if (bilangan < 1 ) {
            System.out.println(+bilangan+ " Kurang dari 1");
        } else if (bilangan > 100) {
            System.out.println(+bilangan+ " Lebih dari 100");*/
        if (bilangan < 1 || bilangan > 100 ) {
            System.out.println(+bilangan+ " Bilangan Salah");
            System.out.println (" Silahkan masukan bilangan yang benar!");
        } else {
            System.out.println("Anda memasukan bilangan yang benar");
        if (bilangan % 2 == 0) {
            System.out.println(+bilangan+ " Merupakan bilangan GENAP");
        } else {
            System.out.println(+bilangan+ " Merupakan bilangan GANJIL");
        }
        }
    }
    
}
