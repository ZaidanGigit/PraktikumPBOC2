/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Mahasiswa
*/

public class Mahasiswa {

    // Atribut
    private int nim;
    private String nama;
    private String programStudi;

    // Method

    // Konstruktor tanpa parameter
    public Mahasiswa(){
        nim = -999;
        nama = "n/a";
        programStudi = "n/a";
    }

    // Konstruktor dengan parameter tergantung input
    public Mahasiswa(int nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor duplikat
    public Mahasiswa(Mahasiswa M){
        this.nim = M.nim;
        this.nama = M.nama;
        this.programStudi = M.programStudi;
    }

    // Mutator atribut nim
    public void setNIM(int nim){
        this.nim = nim;
    }

    // Mutator atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mutator atribut programStudi tanpa parameter
    public void setProgramStudi(){
        this.programStudi = "n/a";
    }

    // Mutator atribut programStudi dengan parameter
    public void setProgramStudi(String x){
        this.programStudi = x;
    }

    // Mutator atribut programStudi dengan parameter sama dengan programStudi objek Mahasiswa y
    public void setProgramStudi (Mahasiswa y){
        this.programStudi = y.programStudi;
    }

    // Cetak data
    public void printInfo(){
        System.out.println( "NIM: " + this.nim + 
                            ", Nama: " + this.nama + 
                            ", Program Studi: " + this.programStudi);
    }
}
