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
public class Fibonacci {
    public static void main(String[] args) {

        int a = 1, b = 1, c;

        System.out.print(a + ", " + b);

        for (int i = 1; i <= 6; i++) {
            c = a + b;
            System.out.print(", " + c);

            a = b;
            b = c;
        }
    }
}
