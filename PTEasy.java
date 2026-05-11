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

class PTEasy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahKaryawan;
        double honorTetap = 700000;
        double totalGaji = 0;

        System.out.println("Program Hitung Honor Karyawan");
        System.out.println("Kontrak PT. EASY");

        System.out.print("\nMasukkan Jumlah Karyawan : ");
        jumlahKaryawan = input.nextInt();

        String[] nama = new String[jumlahKaryawan];
        int[] golongan = new int[jumlahKaryawan];
        int[] pendidikan = new int[jumlahKaryawan];
        int[] jamKerja = new int[jumlahKaryawan];

        double[] tunjanganJabatan = new double[jumlahKaryawan];
        double[] tunjanganPendidikan = new double[jumlahKaryawan];
        double[] honorLembur = new double[jumlahKaryawan];
        double[] gajiBersih = new double[jumlahKaryawan];

        for (int i = 0; i < jumlahKaryawan; i++) {

            input.nextLine();

            System.out.println("\nKaryawan Ke - " + (i + 1));

            System.out.print("Nama Karyawan : ");
            nama[i] = input.nextLine();

            System.out.print("Golongan (1/2/3) : ");
            golongan[i] = input.nextInt();

            System.out.print("Pendidikan (1=SMU/2=D3/3=S1) : ");
            pendidikan[i] = input.nextInt();

            System.out.print("Jumlah Jam Kerja : ");
            jamKerja[i] = input.nextInt();

            if (golongan[i] == 1) {
                tunjanganJabatan[i] = 0.05 * honorTetap;
            } else if (golongan[i] == 2) {
                tunjanganJabatan[i] = 0.10 * honorTetap;
            } else {
                tunjanganJabatan[i] = 0.15 * honorTetap;
            }

            if (pendidikan[i] == 1) {
                tunjanganPendidikan[i] = 0.025 * honorTetap;
            } else if (pendidikan[i] == 2) {
                tunjanganPendidikan[i] = 0.05 * honorTetap;
            } else {
                tunjanganPendidikan[i] = 0.075 * honorTetap;
            }

            if (jamKerja[i] > 240) {
                honorLembur[i] = (jamKerja[i] - 240) * 2500;
            } else {
                honorLembur[i] = 0;
            }

            gajiBersih[i] = honorTetap +
                    tunjanganJabatan[i] +
                    tunjanganPendidikan[i] +
                    honorLembur[i];

            totalGaji += gajiBersih[i];
        }

        System.out.println("\nPT. EASY");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("No Nama\tJabatan\tPendidikan\tLembur\tGaji Bersih");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println((i + 1) + " " +
                    nama[i] + "\t" +
                    tunjanganJabatan[i] + "\t" +
                    tunjanganPendidikan[i] + "\t\t" +
                    honorLembur[i] + "\t" +
                    gajiBersih[i]);
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Total Gaji yang dikeluarkan Rp. " + totalGaji);
    }
}