/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

import java.util.*;
/**
 *
 * @author Mahasiswa
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         Scanner in = new Scanner(System.in);
        
        int bilangan;
        System.out.println("Masukan Sebuah bilangan: ");
        bilangan = in.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println(+bilangan+ " Merupakan bilangan GENAP");
        } else {
            System.out.println(+bilangan+ " Merupakan bilangan GANJIL");
        }
    }
    
}
