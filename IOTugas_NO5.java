package TugasPraktikum3;

public class IOTugas_NO5 {
    public static void main(String[] args) {
        System.out.println("TOTAL BUAH BU SISKA");
        
        int manggaAwal = 70;
        int manggaBusuk = 15;
        int jumlahTetangga = 4;
        int jambuTetangga = 30;
       
        int manggaDibeli = manggaAwal - manggaBusuk;
        int totalJambu = jumlahTetangga * jambuTetangga;
        int totalSemuaBuah = manggaDibeli + totalJambu;
        
        System.out.println("RINCIAN PEMBELIAN BU SISKA");
        System.out.println("");
        System.out.println("Mangga Awal: " + manggaAwal);
        System.out.println("Mangga Busuk: " + manggaBusuk);
        System.out.println("Jumlah Tetangga: " + jumlahTetangga);
        System.out.println("Jambu Per Tetangga: " + jambuTetangga);
        System.out.println("-------------------------------");
        System.out.println("Mangga setelah Di retur: " + manggaDibeli);
        System.out.println("Total Buah Jambu: " + totalJambu);
        System.out.println("Total Semua Buah yang Dibeli: " + totalSemuaBuah);
        
    }
}
