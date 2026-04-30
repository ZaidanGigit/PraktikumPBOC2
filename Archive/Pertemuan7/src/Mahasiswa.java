/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Mahasiswa
*/

public class Mahasiswa {
    private int nim;
    private String nama;
    private String programStudi;

    // Konstruktor
    public Mahasiswa(){
        nim = -999;
        nama = "n/a";
        programStudi = "n/a";
    }

    public Mahasiswa(int nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa M){
        this.nim = M.nim;
        this.nama = M.nama;
        this.programStudi = M.programStudi;
    }

    // setNIM
    public void setNIM(int nim){
        this.nim = nim;
    }

    // setNama
    public void setNama(String nama){
        this.nama = nama;
    }

    // setProgramStudi
    public void setProgramStudi(){
        this.programStudi = "";
    }

    public void setProgramStudi(String x){
        this.programStudi = x;
    }

    public void setProgramStudi (Mahasiswa y){
        this.programStudi = y.programStudi;
    }
}
