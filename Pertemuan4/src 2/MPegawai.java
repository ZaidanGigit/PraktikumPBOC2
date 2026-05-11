/* Nama File    : MPegawai.java
 * Deskripsi    : berisi main pegawai
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main (String[] args){
    // Dosen Tetap
    DosenTetap DTetap1 = new DosenTetap();
    DosenTetap DTetap2 = new DosenTetap("9545647549","Fakultas Suka Mengaji","78647325","Jokowi",LocalDate.of(1945,8,17),LocalDate.of(1965,8,17),4000000);

    // Selektor Dosen Tetap
    System.out.println(DTetap2.getnip());
    System.out.println(DTetap2.getNIDN());
    System.out.println(DTetap2.getnama());
    System.out.println(DTetap2.gettanggalLahir());
    System.out.println(DTetap2.gettmt());
    System.out.println(DTetap2.getJabatan());
    System.out.println(DTetap2.getFakultas());
    System.out.println(DTetap2.getMasaKerja());
    System.out.println(DTetap2.getPensiun());
    System.out.println(DTetap2.getgajiPokok());
    System.out.println(DTetap2.getTunjangan());

    // Mutator Dosen Tetap
    DTetap1.setnip("9545647548");
    DTetap1.setNIDN("78647324");
    DTetap1.setnama("Andi");
    DTetap1.settanggalLahir(LocalDate.of(1990, 5, 5));
    DTetap1.settmt(LocalDate.of(2015,1,1));
    DTetap1.setFakultas("Fakultas Sains dan Matematika");
    DTetap1.setMasaKerja();
    DTetap1.setPensiun();
    DTetap1.setgajiPokok(5000000);
    DTetap1.setTunjangan();

    // PrintInfo Dosen Tetap
    DTetap1.printInfo();
    DTetap2.printInfo();

    // Dosen Tamu
    DosenTamu DTamu1 = new DosenTamu();
    DosenTamu DTamu2 = new DosenTamu("11002","Fakultas Hukum","21002","Burhan",LocalDate.of(1969,1,1),LocalDate.of(1989,1,1),6000000);

    // Selektor Dosen Tamu
    System.out.println(DTamu2.getnip());
    System.out.println(DTamu2.getnidk());
    System.out.println(DTamu2.getnama());
    System.out.println(DTamu2.gettanggalLahir());
    System.out.println(DTamu2.gettmt());
    System.out.println(DTamu2.getJabatan());
    System.out.println(DTamu2.getFakultas());
    System.out.println(DTamu2.getMasaKerja());
    System.out.println(DTamu2.getPensiun());
    System.out.println(DTamu2.getgajiPokok());
    System.out.println(DTamu2.getTunjangan());

    // Mutator Dosen Tamu
    DTamu1.setnip("11001");
    DTamu1.setNIDK("21001");
    DTamu1.setnama("Bahlil");
    DTamu1.settanggalLahir(LocalDate.of(1990, 5, 5));
    DTamu1.settmt(LocalDate.of(2015,1,1));
    DTamu1.setFakultas("Fakultas Ekonomi dan Bisnis");
    DTamu1.setMasaKerja();
    DTamu1.setPensiun();
    DTamu1.setgajiPokok(5000000);
    DTamu1.setTunjangan();

    // PrintInfo Dosen Tamu
    DTamu1.printInfo();
    DTamu2.printInfo();

    // Tenaga Pendidikan
    Tendik T1 = new Tendik();
    Tendik T2 = new Tendik("Kemahasiswaan","12002","Adel",LocalDate.of(1996,1,1),LocalDate.of(2016,1,1),3000000);

    // Selektor Tenaga Pendidikan
    System.out.println(T2.getnip());
    System.out.println(T2.getnama());
    System.out.println(T2.gettanggalLahir());
    System.out.println(T2.gettmt());
    System.out.println(T2.getJabatan());
    System.out.println(T2.getBidang());
    System.out.println(T2.getMasaKerja());
    System.out.println(T2.getPensiun());
    System.out.println(T2.getgajiPokok());
    System.out.println(T2.getTunjangan());


    // Mutator Tenaga Pendidikan
    T1.setnip("12001");
    T1.setnama("Bahlil");
    T1.settanggalLahir(LocalDate.of(1990, 5, 5));
    T1.settmt(LocalDate.of(2015,1,1));
    T1.setBidang("Akademik");
    T1.setMasaKerja();
    T1.setPensiun();
    T1.setgajiPokok(5000000);
    T1.setTunjangan();

    // PrintInfo Tenaga Pendidikan
    T1.printInfo();
    T2.printInfo();

    }
}
