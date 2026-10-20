package TugasPraktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTugas_NO4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.println("MENGHITUNG GAYA SENTRIPETAL");
        
        System.out.println("RUMUS: Fc = (M * v^2)/r");
        System.out.println("");
        System.out.print("Masukan Massa(m): ");
        double m = Double.parseDouble(br.readLine());
        
        System.out.print("masukan Kecepatan(v): ");
        double v = Double.parseDouble(br.readLine());
        
        System.out.print("Masukan Jari-jari(r)");
        double r = Double.parseDouble(br.readLine());
        
        //PERHITUNGAN
        double fc = (m * Math.pow(v, 2)) / r;
        
        System.out.println("HASIL");
        System.out.println("Massa(m) : " + m);
        System.out.println("Kecepatan(v) : " + v);
        System.out.println("Jari-jari(r) : " + r);
        System.out.println("Gaya Sentripetal : " + fc);
    }
}
