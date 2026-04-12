import java.util.*;

public class TokoSusu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char kodeSusu;
        int kodeUkuran;
        int harga = 0, jumlah, total;
        String jenis = "", ukuran = "";

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("A. Dancow");
        System.out.println("B. Bendera");
        System.out.println("C. SGM");
        System.out.println("\nUkuran:");
        System.out.println("1. Kecil");
        System.out.println("2. Sedang");
        System.out.println("3. Besar");

        System.out.print("\nMasukan Kode Susu [A/B/C] : ");
        kodeSusu = in.next().charAt(0);

        System.out.print("Masukan Kode Ukuran [1/2/3] : ");
        kodeUkuran = in.nextInt();

        switch (kodeSusu) {
            case 'A':
            case 'a':
                jenis = "Dancow";
                if (kodeUkuran == 1) { harga = 25000; ukuran = "Kecil"; }
                else if (kodeUkuran == 2) { harga = 20000; ukuran = "Sedang"; }
                else if (kodeUkuran == 3) { harga = 15000; ukuran = "Besar"; }
                break;

            case 'B':
            case 'b':
                jenis = "Bendera";
                if (kodeUkuran == 1) { harga = 20000; ukuran = "Kecil"; }
                else if (kodeUkuran == 2) { harga = 17500; ukuran = "Sedang"; }
                else if (kodeUkuran == 3) { harga = 13500; ukuran = "Besar"; }
                break;

            case 'C':
            case 'c':
                jenis = "SGM";
                if (kodeUkuran == 1) { harga = 22000; ukuran = "Kecil"; }
                else if (kodeUkuran == 2) { harga = 18500; ukuran = "Sedang"; }
                else if (kodeUkuran == 3) { harga = 15000; ukuran = "Besar"; }
                break;

            default:
                System.out.println("Kode susu tidak valid!");
                return;
        }

        System.out.println("Jenis Susu : " + jenis);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga Satuan : Rp. " + harga);

        System.out.print("Jumlah beli : ");
        jumlah = in.nextInt();

        total = harga * jumlah;

        System.out.println("\nTOTAL BAYAR = Rp. " + total);
    }
}