/*
nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Anabul
*/

public class Anabul {
    // atribut
    private String panggilan;

    
    // method

    // Konstruktor dengan parameter null
    public Anabul(){
        this.panggilan = "";
    }

    // Konstruktor dengan parameter sesuai input
    public Anabul(String panggilan){
        this.panggilan = panggilan;
    }

    // Selektor atribut panggilan
    public String getpanggilan(){
        return this.panggilan;
    }

    // Mutator atribut panggilan
    public void setpanggilan(String panggilan){
        this.panggilan = panggilan;
    }

    // Mencetak cara gerak Anabul
    public void Gerak(){
        System.out.println("Anabul " + panggilan + " bergerak...");
    }

    // Mencetak cara Anabul bersuara
    public void Bersuara(){
        System.out.println("Anabul " + panggilan + " bersuara....");
    }

    
}
