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

    // Konstruktor dengan parameter null
    public Anabul(){
        this.nama = "";
    }

    // Konstruktor dengan parameter sesuai input
    public Anabul(String nama){
        this.nama = nama;
    }

    // Selektor atribut nama
    public String getNama(){
        return this.nama;
    }

    // Mutator atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mencetak cara gerak Anabul
    public void Gerak(){
        System.out.println("Anabul " + nama + " bergerak...");
    }

    // Mencetak cara Anabul bersuara
    public void Bersuara(){
        System.out.println("Anabul " + nama + " bersuara....");
    }
}
