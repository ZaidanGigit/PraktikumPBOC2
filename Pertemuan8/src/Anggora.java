/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Anggora
*/

public class Anggora extends Anabul{

    // Atribut 
    protected double bobot;

    // Method

    // Konstruktor tanpa parameter
    public Anggora() {
        super();
        this.bobot = 0.0;
    }

    // Konstruktor dengan parameter input
    public Anggora(String Nama, double bobot) {
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
    
    
    @Override
    // Prosedur turunan dari Anabul yang mencetak cara gerak Anabul Anggora
    public void Gerak(){
        System.out.println("Anggora " + getNama() + " loncat loncat");
    }

    // Prosedur turunan dari Anabul yang mencetak cara Anabul Anggora bersuara
    public void Bersuara(){
        System.out.println("Anggora " + getNama() + " mengong dengan lembut");
    }
}
