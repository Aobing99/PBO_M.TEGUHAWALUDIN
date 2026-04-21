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
public class DeretGanjilP5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a,total=0;
        
        for (a = 1; a <= 20; a+=2) {
            System.out.print(a + "+");
            total = total+a;
        }
        System.out.print(" = "+total);
    }
    
}
