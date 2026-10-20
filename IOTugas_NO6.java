package TugasPraktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTugas_NO6 {
    public static void main(String[] args) throws IOException {
        System.out.println("MENGHITUNG SELISIH WAKTU");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("WAKTU PERTAMA.");
            System.out.println("Jam :");
            int jam1 = Integer.parseInt(br.readLine());
            
            System.out.println("Menit: ");
            int menit1 = Integer.parseInt(br.readLine());
            
            System.out.println("Detik: ");
            int detik1 = Integer.parseInt(br.readLine());
            
            System.out.println("");
            
            System.out.println("WAKTU KEDUA.");
            int jam2 = Integer.parseInt(br.readLine());
            
            System.out.println("Menit: ");
            int menit2 = Integer.parseInt(br.readLine());
            
            System.out.println("Detik: ");
            int detik2 = Integer.parseInt(br.readLine());
            
            //KONVERSI ANTARA KEDUA WAKTU KE TOTAL DETIK
            int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
            int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
            
            //SELISIH
            //Math.abs digunakan supaya mendapatkan nilai mutlak. bukan negatif.
            int selisihTotalDetik = Math.abs(totalDetik2 - totalDetik1);
            
            //KONVETSI KEMBALI
            int selisihJam = selisihTotalDetik/3600;
            int sisaDetik = selisihTotalDetik % 3600;
            int selisihMenit = sisaDetik / 60;
            int selisihDetikAkhir = sisaDetik % 60;
            
            //HASIL
            System.out.println("           HASIL SELISIH WAKTU            ");
            System.out.println("Waktu 1 : " + jam1 + " jam, " + menit1 + " menit, " + detik1 + " detik");
            System.out.println("Waktu 2 : " + jam2 + " jam, " + menit2 + " menit, " + detik2 + " detik");
            System.out.println("------------------------------------------");
            System.out.println("Selisih : " + selisihJam + " jam, " + selisihMenit + " menit, " + selisihDetikAkhir + " detik");
            
    }
}
