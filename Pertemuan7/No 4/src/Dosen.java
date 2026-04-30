/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Dosen
*/

public class Dosen extends Civitasakademika {
    // Atribut
    private String nip;

    // Konstruktor Dosen tanpa parameter
    public Dosen(){
        setNama("");
        this.nip = "";
    }

    // Konstruktor Dosen dengan parameter berdasarkan input
    public Dosen (String nama, String nip){
        setNama(nama);
        this.nip = nip;
    }

    // Selektor nip 
    public String getNIP(){
        return this.nip;
    }

    // Mutator nip
    public void setNIP(String nip){
        this.nip = nip;
    }

    // Mengembalikan nama dosen wali
    @Override
    public String getNomor(){
        return this.nip;
    }
}
