/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tamu
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /* Atribut */
    private String nidk;

    /* Konstruktor DosenTamu dengan data default */
    public DosenTamu(){
        new Dosen();
        nidk = "";
        setJabatan("Dosen Tamu");
    }

    /* Konstruktor DosenTamu dengan data berdasarkan input */
    public DosenTamu(String nidk, String fakultas, String nip, String nama, LocalDate tanggaLahir, LocalDate tmt, int gajiPokok){
        super(fakultas, nip, nama, tanggaLahir, tmt, gajiPokok, "Dosen Tamu");
        this.nidk = nidk;
    }

    /* Selektor */
    /* Mengembalikan data NIDK */
    public String getnidk(){
        return nidk;
    }

    /* Mutator */
    /* Mengubah data NIDK */
    public void setNIDK(String nidk){
        this.nidk = nidk;
    }

    @Override
    /* Mencetak Keseluruhan data pada DosenTamu */
    public void printInfo(){
        System.out.println("NIP: " + getnip());
        System.out.println("NIDK: " + getnidk());
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

        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Fakultas: " + getFakultas());
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

        System.out.println("Gaji Pokok: Rp " + getgajiPokok() + ",00");
        System.out.println("Tunjangan: 2.5% x Rp " + getgajiPokok() + ",00 = Rp. " + getTunjangan() + ",00");
    }
}
