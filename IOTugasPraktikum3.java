package TugasPraktikum3;
import java.util.Scanner;
public class IOTugasPraktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor Induk Karyawan: ");
        String nik = input.nextLine();
        
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        
        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok: ");
        int gajiPokok = input.nextInt();
        
        System.out.print("Tunjangan Jabatan: ");
        int tunjanganJabatan = input.nextInt();
        
        System.out.print("Tunjangan Istri: " );
        int tunjanganIstri = input.nextInt();
        
        System.out.print("Tunjangan Anak: ");
        int tunjanganAnak = input.nextInt();
        
        int totalGaji = (gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak);
        
        int pajakPenghasilan = (10/100 * (gajiPokok + tunjanganJabatan + tunjanganAnak));
        
        int gajiBersih = (totalGaji - pajakPenghasilan);
 
        System.out.println("");
        System.out.println("GAJI KARYAWAN:");
        System.out.println("Nomor Induk Karyawan: " + nik);
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Jabatan" + tunjanganJabatan);
        System.out.println("Tunjangan Istri" + tunjanganIstri);
        System.out.println("Tunjangan Anak" + tunjanganAnak);
        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Pajak Penghasilan: " + pajakPenghasilan);
        System.out.println("Gaji bersih: " + gajiBersih);
    }
}
