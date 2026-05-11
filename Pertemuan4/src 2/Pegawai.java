/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai{
    /* Atribut */
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private int gajiPokok;
    private String jabatan;
    private Period masaKerja;
    private LocalDate pensiun;
    private int tunjangan;

    /* Method */

    /* Konstruktor Pegawai dengan data default*/
    public Pegawai(){
        nip = "";
        nama = "";
        tanggalLahir = LocalDate.of(0000,01,01);
        tmt = LocalDate.of(0000,01,01);
        gajiPokok = 0;
        jabatan = "";
        masaKerja = Period.between(tmt, LocalDate.now());
        pensiun = LocalDate.of(0000,01,01);
        tunjangan = 0;
    }

    /* Konstruktor Pegawai dengan data berdasarakan input */
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String jabatan){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
        this.masaKerja = Period.between(tmt, LocalDate.now());
        /* BUP Tenaga Pendidikan, Dosen Tamu, & Dosen Tetap */
        if(jabatan.equals("Dosen Tetap") || jabatan.equals("Dosen Tamu")){
            this.pensiun = tanggalLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
        }
        else if(jabatan.equals("Tenaga Pendidikan")){
            this.pensiun = tanggalLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        }

        /* Tunjangan Dosen Tetap, Dosen Tamu, & Tenaga Pendidikan */
        if(jabatan.equals("Dosen Tetap")){
            this.tunjangan = masaKerja.getYears() * gajiPokok * 2 / 100;
        }
        else if(jabatan.equals("Dosen Tamu")){
            this.tunjangan = gajiPokok * 25 /1000;
        }
        else if(jabatan.equals("Tenaga Pendidikan")){
            this.tunjangan = masaKerja.getYears() * gajiPokok * 1 /100;
        }
    }

    /* Selektor */

    /* Mengembalikan data NIP */
    public String getnip(){
        return nip;
    }

    /* Mengembalikan data Nama */
    public String getnama(){
        return nama;
    }

    /* Mengembalikan data TanggalLahir */
    public LocalDate gettanggalLahir(){
        return tanggalLahir;
    }

    /* Mengembalikan data TMT */
    public LocalDate gettmt(){
        return tmt;
    }

    /* Mengembalikan nilai GajiPokok */
    public int getgajiPokok(){
        return gajiPokok;
    }

    /* Mengembalikan data Jabatan */
    public String getJabatan(){
        return this.jabatan;
    }

    /* Mengembalikan data Masa Kerja */
    public Period getMasaKerja(){
        return masaKerja;
    }

    /* Mengembalikan data Tanggal Pensiun */
    public LocalDate getPensiun(){
        return pensiun;
    }

    /* Mengembalikan nilai Tunjangan */
    public int getTunjangan(){
        return tunjangan;
    }

    /* Mutator */
    /* Mengubah data NIP */
    public void setnip(String nip){
        this.nip = nip;
    }

    /* Mengubah data Nama */
    public void setnama(String nama){
        this.nama = nama;
    }

    /* Mengubah data Tanggal Lahir */
    public void settanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    /* Mengubah data TMT */
    public void settmt(LocalDate tmt){
        this.tmt = tmt;
    }

    /* Mengubah nilai Gaji Pokok */
    public void setgajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    /* Mengubah data Jabatan */
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    /* Mengubah data Masa Kerja */
    public void setMasaKerja(){
        this.masaKerja = Period.between(this.tmt, LocalDate.now());
    }
     
    /* Mengubah data tanggal pensiun */
    public void setPensiun(){
        if(jabatan.equals("Dosen Tetap") || jabatan.equals("Dosen Tamu")){
            this.pensiun = this.tanggalLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
        }
        else if(jabatan.equals("Tenaga Pendidikan")){
            this.pensiun = this.tanggalLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        }
    }

    /* Mengubah nilai tunjangan */
    public void setTunjangan(){
        if(jabatan.equals("Dosen Tetap")){
            this.tunjangan = this.masaKerja.getYears() * gajiPokok * 2 / 100;
        }
        else if(jabatan.equals("Dosen Tamu")){
            this.tunjangan = gajiPokok * 25 /1000;
        }
        else if(jabatan.equals("Tenaga Pendidikan")){
            this.tunjangan = this.masaKerja.getYears() * gajiPokok * 1 /100;
        }
    }

    /* Mencetak semua data dari atribut Pegawai */
    public void printInfo(){
        System.out.println("NIP: " + getnip());
        System.out.println("Nama: " + getnama());
        if(gettanggalLahir().getMonthValue() == 1){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Januari " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 2){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Februari " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 3){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Maret " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 4){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " April " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 5){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Mei " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 6){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Juni " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 7){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Juli " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 8){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Agustus " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 9){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " September " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 10){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Oktober " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 11){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " November " + gettanggalLahir().getYear());
        }
        else if(gettanggalLahir().getMonthValue() == 12){
            System.out.println("Tanggal Lahir: " + gettanggalLahir().getDayOfMonth() + " Desember " + gettanggalLahir().getYear());
        }

        if(gettmt().getMonthValue() == 1){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Januari " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 2){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Februari " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 3){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Maret " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 4){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " April " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 5){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Mei " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 6){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Juni " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 7){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Juli " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 8){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Agustus " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 9){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " September " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 10){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Oktober " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 11){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " November " + gettmt().getYear());
        }
        else if(gettmt().getMonthValue() == 12){
            System.out.println("TMT: " + gettmt().getDayOfMonth() + " Desember " + gettmt().getYear());
        }
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Masa Kerja: " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");

        if(getPensiun().getMonthValue() == 1){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Januari " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 2){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Februari " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 3){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Maret " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 4){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " April " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 5){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Mei " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 6){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Juni " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 7){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Juli " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 8){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Agustus " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 9){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " September " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 10){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Oktober " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 11){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " November " + getPensiun().getYear());
        }
        else if(getPensiun().getMonthValue() == 12){
            System.out.println("Tanggal Pensiun: " + getPensiun().getDayOfMonth() + " Desember " + getPensiun().getYear());
        }

        System.out.println("Tunjangan: " + tunjangan);
    }
}