package TugasPraktikum3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOTugas_NO3 {
//    SCANNER : Memiliki fungsi bawaan untuk  parsing berbagai tipe data seperti nextInt(), nextDouble(), dan lain-lain.
//    BUFFERREADER: SEMUA INPUT DIBACA SEBAGAI TEXT/STRING MELALUI FUNGSI READLINE SEHINGGA JIKA INGIN TIPE DATA LAIN, HARUS DIKONVERSI TERLEBIH DAHULU
    public static void main(String[] args) throws IOException {
        
//        CONTOH CLASS SCANNER
        System.out.println("Class Scanner");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama: ");
        String nama = input.nextLine(); //String langsung dibaca
        
        System.out.print("Masukan Umur: ");
        int umur = input.nextInt(); //Langsung membaca integer tanpa konversi
        
        System.out.println("Hasil Scanner. Nama: " + nama + ", Umur: " + umur);
        
        System.out.println("");
        
//        CONTOH CLASS BUFFEREDREADER
        System.out.println("CLASS BUFFEREDREADER");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukan Nama: ");
        String namabr = br.readLine(); //Membaca input sebagai String
        
        System.out.print("Masukan Umur: ");
        //Harus dikonversi manusal dari Sring ke Int menggunakan Integer.parseInt()
        int umurbr = Integer.parseInt(br.readLine());
        
        System.out.println("Hasil BufferReader. Nama " + namabr + ", Umur " + umurbr + " tahun");
    }
}
