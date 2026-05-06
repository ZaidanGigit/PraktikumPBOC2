/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Burung
*/

public class Burung extends Anabul {

    // Method

    // Konstruktor Burung tanpa parameter
    public Burung (){
        setNama("");
    }

    // Konstruktor Burung dengan parameter input
    public Burung (String nama){
        setNama(nama);
    }

    @Override
    // Prosedur turunan dari Anabul yang mencetak cara gerak Anabul Burung
    public void Gerak(){
        System.out.println("Burung " + getNama() + " terbang ");
    }

    // Prosedur turunan dari Anabul yang mencetak cara Anabul Burung bersuara
    public void Bersuara(){
        System.out.println("Burung " + getNama() + " berbunyi cuit");
    }
}
