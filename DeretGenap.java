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
public class DeretGenap {
    public static void main(String[] args) {

        int jumlah = 0;

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i);

            jumlah += i;

            if (i < 20) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + jumlah);
    }
}
