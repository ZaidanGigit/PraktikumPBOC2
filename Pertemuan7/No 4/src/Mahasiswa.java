/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Mahasiswa
*/

public class Mahasiswa extends Civitasakademika {
    // Atribut
    private String nim;
    private String dosenWali;

    // Method

    // Konstruktor Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.dosenWali = "";
    }

    // Konstruktor Mahasiswa dengan parameter berdasarkan input
    public Mahasiswa(String nim, String nama, String dosenWali){
        this.nim = nim;
        this.dosenWali = dosenWali;
        setNama(nama);
    }
    
    // Selektor nim
    public String getNIM(){
        return this.nim;
    }

    // selektor dosen walu
    public String getDosenWali(){
        return this.dosenWali;
    }

    // Mutator nim
    public void setNIM(String nim){
        this.nim = nim;
    }

    // Mutator dosen wali
    public void setWali(Dosen D){
        this.dosenWali = D.getNama();
    }

    // Mengembalikan nilai nim Mahasiswa
    @Override
    public String getNomor(){
        return this.nim;
    }

    // Cetak semua data Mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("Nama: " + getNama() + ", NIM: " + getNIM() + ", Dosen Wali: " + getDosenWali());
    }

}
