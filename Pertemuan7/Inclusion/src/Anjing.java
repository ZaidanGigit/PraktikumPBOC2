/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Anjing
*/

public class Anjing extends Anabul {

    // Method

    // Konstruktor Anjing tanpa parameter
    public Anjing (){
        setNama("");
    }

    // Konstruktor Anjing dengan parameter input
    public Anjing (String nama){
        setNama(nama);
    }
    
    
    @Override
    // Prosedur turunan dari Anabul yang mencetak cara gerak Anabul Anjing
    public void Gerak(){
        System.out.println("Anjing " + getNama() + " melata");
    }

    // Prosedur turunan dari Anabul yang mencetak cara Anabul Anjing bersuara
    public void Bersuara(){
        System.out.println("Anjing " + getNama() + " berbunyi guk guk");
    }
}
