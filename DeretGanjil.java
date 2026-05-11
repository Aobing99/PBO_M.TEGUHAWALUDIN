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
public class DeretGanjil {
    public static void main(String[] args) {

        int jumlah = 0;

        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i);

            jumlah += i;

            if (i < 19) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + jumlah);
    }
}
