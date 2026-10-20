package TugasPraktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTugas_NO7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Menghitung Waktu Pencetakan Novel");
        System.out.print("Masukan Jumlah Novel yang akan dicetak: ");
        int jumlahNovel = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Tebal Lembar per Novel: ");
        int tebalLembar = Integer.parseInt(br.readLine());
        
        //Menghitung total lembar (karena 1 lembar = 1 detik, maka totalLembar = totalDetik)
        long totalLembar = (long) jumlahNovel * tebalLembar; 
        long sisaDetik = totalLembar;//total detik yang diproses
        
        //KONOVERSI TOTAL DETIK KE HARI, JAM, MENIT, DETIK
        long hari = sisaDetik/86400; //1 hari = 86400 detik
        sisaDetik = sisaDetik % 86400;
        
        long jam = sisaDetik / 3600; // 1 jam = 3600 detik
        sisaDetik = sisaDetik % 3600;

        long menit = sisaDetik / 60; // 1 menit = 60 detik
        long detik = sisaDetik % 60;
                
        System.out.println("          HASIL ESTIMASI WAKTU            ");
        System.out.println("Jumlah Novel    : " + jumlahNovel + " buah");
        System.out.println("Tebal per Novel : " + tebalLembar + " lembar");
        System.out.println("Total Cetak     : " + totalLembar + " lembar (" + totalLembar + " detik)");
        System.out.println("------------------------------------------");
        System.out.println("Waktu Dibutuhkan: " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");
    }
}
