/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam abstract class Manusia
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 9 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    // Atribut
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    // Method //
    
    // Konstruktor //
    public Manusia (String nama, LocalDate mulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = mulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia(){
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    // Selector //
    public String getNama(){
        return this.nama;
    }

    public LocalDate getTglMulaiKerja(){
        return this.tgl_mulai_kerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public double getPendapatan(){
        return this.pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    // Mutator //
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tanggal){
        this.tgl_mulai_kerja = tanggal;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // Cetak Info //
    public void cetakInfo(){
        System.out.println("Nama Manusia: " +getNama());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Pendapatan: " + getPendapatan());
    }

    // Hitung Masa Kerja //
    public abstract int hitungMasaKerja();
}
