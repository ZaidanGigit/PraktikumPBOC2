/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai{
    /* Atribut */
    private String fakultas;

    /* Konstruktor */
    public Dosen(){
        new Pegawai();
        fakultas = "";
        setJabatan("");
    }

    public Dosen(String fakultas, String nip, String nama, LocalDate tanggaLahir, LocalDate tmt, int gajiPokok, String jabatan){
        super(nip, nama, tanggaLahir, tmt, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    /* Selektor */
    public String getFakultas(){
        return fakultas;
    }

    /* Mutator */
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("fakultas: " + getFakultas());
    }
}
