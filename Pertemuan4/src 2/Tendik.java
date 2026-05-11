/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai{
    /* Atribut */
    private String bidang;

    /* Method */

    /* Konstruktor Tendik dengan data default */
    public Tendik(){
        new Pegawai();
        this.bidang = "";
        setJabatan("Tenaga Pendidikan");
    }

    /* Konstruktor Tendik dengan data berdasarkan input */
    public Tendik(String bidang, String nip, String nama, LocalDate tanggaLahir, LocalDate tmt, int gajiPokok){
        super(nip, nama, tanggaLahir, tmt, gajiPokok, "Tenaga Pendidikan");
        this.bidang = bidang;
    }

    /* Selektor */
    /* Mengembalikan data bidang */
    public String getBidang(){
        return this.bidang;
    }

    /* Mutator */
    /* Mengubah data bidang */
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    /* Mencetak keseluruhan data pada Tendik */
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

        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Bidang: " + getBidang());
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
        System.out.println("Tunjangan: 1% x " + getMasaKerja().getYears() + " x Rp " + getgajiPokok() + ",00 = Rp. " + getTunjangan() + ",00");
    }
}
