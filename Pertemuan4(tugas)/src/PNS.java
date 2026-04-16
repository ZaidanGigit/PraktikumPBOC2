/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 9 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    // Atribut //
    private String nip;
    private static int counterPNS = 0;

    // Method //

    // Konstruktor //
    public PNS (String nama, LocalDate tanggal, String alamat, double Pendapatan, String nip){
        setNama(nama);
        setTglMulaiKerja(tanggal);
        setAlamat(alamat);
        setPendapatan(Pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS (){
        setNama("");
        setTglMulaiKerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        setNIP("");
        counterPNS++;
    }
    
    // Selektor //
    public String getNIP(){
        return this.nip;
    }

    // Mutator //
    public void setNIP(String nip){
        this.nip = nip;
    }

    // getCounterPNS //
    public static int getCounterPNS(){
        return counterPNS;
    }

    // Hitung Masa Kerja //
    public int hitungMasaKerja(){
        // NIM digit ke-14 = 2
        return (int) ChronoUnit.DAYS.between(getTglMulaiKerja(), LocalDate.now()) + 2;
    }

    // Hitung Pajak //
    public double hitungPajak(){
        return getPendapatan() * 0.1;
    }

    // cetakInfo //
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + getNIP());
    }
}