/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        double uts, uas, tugas;
        double murniUTS, murniUAS, murniTugas, nilaiAkhir;

        System.out.print("Masukan Nama Siswa : ");
        nama = input.nextLine();

        System.out.print("Nilai UTS : ");
        uts = input.nextDouble();

        System.out.print("Nilai UAS : ");
        uas = input.nextDouble();

        System.out.print("Nilai Tugas Mandiri : ");
        tugas = input.nextDouble();

        murniUTS = uts * 0.35;
        murniUAS = uas * 0.45;
        murniTugas = tugas * 0.20;

        nilaiAkhir = murniUTS + murniUAS + murniTugas;

        System.out.println("\nNilai Murni yang diperoleh :");
        System.out.println("Nilai Murni UTS    : " + murniUTS);
        System.out.println("Nilai Murni UAS    : " + murniUAS);
        System.out.println("Nilai Murni Tugas  : " + murniTugas);

        System.out.println("Nilai Akhir yang diperoleh yaitu : " + nilaiAkhir);
    }
}