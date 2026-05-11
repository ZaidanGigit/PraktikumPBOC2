/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

public class Persegi extends BangunDatar {
    /* Atribut */
    private double sisi;

    /* konstruktor dengan nilai default */
    public Persegi(){
        setJmlSisi(4);
    }

    /* konstruktor dengan nilai berdasarkan input */
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    /* Method */

    /* Selektor */

    /* Mengembalikan jumlah sisi */
    public double getSisi(){
        return sisi;
    }

    /* Mutator */

    /* Mengubah jumlah sisi */
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /* Menghitung luas Persegi */
    public double getLuas(){
        return sisi * sisi;
    }

    /* Menghitung keliling persegi */
    public double getKeliling(){
        return 4 * sisi;
    }

    /* Menghitung diagonal persegi */
    public double getDiagonal(){
        return Math.sqrt(Math.pow(sisi,2) * 2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi: " + sisi);
    }
}