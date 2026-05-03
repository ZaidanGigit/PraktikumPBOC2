/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Kucing
*/

public class Kucing extends Anabul {

    // Method

    // Konstruktor Kucing tanpa parameter
    public Kucing(){
        setNama("");
    }

    // Konstruktor Kucing dengan parameter input
    public Kucing (String nama){
        setNama(nama);
    }

    @Override
    // Prosedur turunan dari Anabul yang mencetak cara gerak Anabul Kucing
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " melata");
    }

    // Prosedur turunan dari Anabul yang mencetak cara Anabul Kucing bersuara
    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }
}
