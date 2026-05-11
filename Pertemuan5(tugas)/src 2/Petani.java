/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 9 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak{
    // Atribut //
    private String asal_kota;
    private static int counterPetani = 0;

    // Method //

    // Konstruktor //
    public Petani (String nama, LocalDate tanggal, String alamat, double Pendapatan, String asal_kota){
        setNama(nama);
        setTglMulaiKerja(tanggal);
        setAlamat(alamat);
        setPendapatan(Pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public Petani (){
        setNama("");
        setTglMulaiKerja(LocalDate.now());
        setAlamat("");
        setPendapatan(0.0);
        this.asal_kota = "";
        counterPetani++;
    }
    
    // Selektor //
    public String getAsalKota(){
        return this.asal_kota;
    }

    // Mutator //
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // getCounterPetani //
    public static int getCounterPetani(){
        return counterPetani;
    }

    // Hitung Masa Kerja //
    public int hitungMasaKerja(){
        // NIM digit ke-13 = 0
        return (int) ChronoUnit.DAYS.between(getTglMulaiKerja(), LocalDate.now()) + 0;
    }

    // Hitung Pajak //
    public double hitungPajak(){
        return 0;
    }

    // cetakInfo //
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + getAsalKota());
    }
}
