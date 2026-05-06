/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Kucing dengan tambahan bobot
*/

public class Kucing extends Anabul {

    // Method

    protected double bobot;

    // Konstruktor non parameter
    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    // Konstruktor dengan parameter
    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    // Selektor bobot 
    public double getBobot() {
        return bobot;
    }

    // Mutator bobot
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // Keluarkan bobot
    public void printBobot(){
        System.out.println("bobotnya adalah "+ getBobot());
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
