/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    /* Atribut */
    private double jari;

    /* Konstruktor */
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border){
        super(1,warna,border);
        this.jari = jari;
    }

    /* Method */

    /* Selektor */

    public double getJari(){
        return jari;
    }

    /* Mutator */

    public void setJari(double jari){
        this.jari = jari;
    }

    /* Menghitung Luas Lingkaran */
    public double getLuas(){
        return Math.PI * Math.pow(jari,2);
    }

    /* Menghitung Keliling Lingkaran */
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    /* @Override untuk membuat fungsi independen untuk class tertentu*/
    @Override

    /* Mencetak data Lingkaran */
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
