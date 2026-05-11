/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
/**
 *
 * @author AoBing
 */
import java.util.Scanner;

class GerobakFriedChicken {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int banyakJenis;
        String[] jenis = new String[10];
        int[] harga = new int[10];
        int[] banyakBeli = new int[10];
        int[] jumlah = new int[10];

        int totalBayar = 0;

        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode Jenis Harga");
        System.out.println("---------------------------");
        System.out.println("D    Dada   Rp. 2500");
        System.out.println("P    Paha   Rp. 2000");
        System.out.println("S    Sayap  Rp. 1500");
        System.out.println("---------------------------");

        System.out.print("\nBanyak Jenis : ");
        banyakJenis = input.nextInt();

        for (int i = 0; i < banyakJenis; i++) {

            System.out.println("\nJenis Ke - " + (i + 1));

            System.out.print("Jenis Potong [D/P/S] : ");
            jenis[i] = input.next();

            System.out.print("Banyak Potong : ");
            banyakBeli[i] = input.nextInt();

            if (jenis[i].equalsIgnoreCase("D")) {
                harga[i] = 2500;
                jenis[i] = "Dada";
            } else if (jenis[i].equalsIgnoreCase("P")) {
                harga[i] = 2000;
                jenis[i] = "Paha";
            } else if (jenis[i].equalsIgnoreCase("S")) {
                harga[i] = 1500;
                jenis[i] = "Sayap";
            }

            jumlah[i] = harga[i] * banyakBeli[i];
            totalBayar += jumlah[i];
        }

        double pajak = totalBayar * 0.10;
        double totalAkhir = totalBayar + pajak;

        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("--------------------------------------------------");
        System.out.println("No\tJenis\tHarga\tBanyak\tJumlah");
        System.out.println("\tPotong\tSatuan\tBeli\tHarga");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < banyakJenis; i++) {
            System.out.println((i + 1) + "\t" + jenis[i] + "\tRp." +
                    harga[i] + "\t" + banyakBeli[i] + "\tRp." + jumlah[i]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Jumlah Bayar\tRp. " + totalBayar);
        System.out.println("Pajak 10%\tRp. " + pajak);
        System.out.println("Total Bayar\tRp. " + totalAkhir);
    }
}
