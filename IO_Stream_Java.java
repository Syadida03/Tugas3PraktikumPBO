package TugasPraktikum3;
import java.io.*;
public class IO_Stream_Java {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
        );
        String file = "nota.dat";
        
        System.out.print("Nama: ");
        String nama = br.readLine();
        
        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(br.readLine());
        
        System.out.print("Diskon(%): ");
        double diskon = Double.parseDouble(br.readLine());
        
        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(br.readLine());
        
        DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
        output.writeUTF(nama);
        output.writeDouble(totalBelanja);
        output.writeDouble(diskon);
        output.writeDouble(bayar);
        output.close();
        
        System.out.println("Data Berhasil Tersimpan ke File " + file);
        
        DataInputStream input = new DataInputStream(new FileInputStream(file));
        String readNama = input.readUTF();
        double readTotalBelanja = input.readDouble();
        double readDiskon = input.readDouble();
        double readBayar = input.readDouble();
        input.close();
        
        double nilaiDiskon = (readDiskon/100) * readTotalBelanja;
        double totalAkhir = readTotalBelanja - nilaiDiskon;
        double kembalian = readBayar - totalAkhir;
        
        System.out.println("NOTA PEMBELANJAAN");
        System.out.println("Nama: " + readNama);
        System.out.println("Total Belanja: " + readTotalBelanja);
        System.out.println("Diskon: " + readDiskon + "%");
        System.out.println("Total: " + totalAkhir);
        System.out.println("Bayar: " + readBayar);
        System.out.println("Kembalian: " + kembalian);
        
        
    }
}
