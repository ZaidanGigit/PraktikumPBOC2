/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Anabul
*/

public class Anabul {
    // atribut
    private String nama;
    
    // method
    public Anabul(){
        this.nama = "";
    }

    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void Gerak(){
        System.out.println("Anabul " + nama + " bergerak...");
    }

    public void Bersuara(){
        System.out.println("Anabul " + nama + " bersuara....");
    }
}
