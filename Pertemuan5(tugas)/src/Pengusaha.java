/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 9 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    // Atribut //
    private String npwp;
    private static int counterPengusaha = 0;

    // Method //

    // Konstruktor //
    public Pengusaha (String nama, LocalDate tanggal, String alamat, double Pendapatan, String npwp){
        setNama(nama);
        setTglMulaiKerja(tanggal);
        setAlamat(alamat);
        setPendapatan(Pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public Pengusaha (){
        setNama("");
        setTglMulaiKerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        this.npwp = "";
        counterPengusaha++;
    }
    
    // Selektor //
    public String getNPWP(){
        return this.npwp;
    }

    // Mutator //
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    // getCounterPengusaha //
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // Hitung Masa Kerja //
    public int hitungMasaKerja(){
        // NIM digit ke-13 = 0
        return (int) ChronoUnit.DAYS.between(getTglMulaiKerja(), LocalDate.now()) + 0;
    }

    // Hitung Pajak //
    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    // cetakInfo //
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + getNPWP());
    }
}
