/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 26 Februari 2026
 */

import org.w3c.dom.css.Counter;
public class Garis {
    /*************** ATRIBUT ***************/
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/

    /* Membuat objek baru garis dengan nilai berdasarkan input */
    Garis(Titik T1, Titik T2){
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }

    /* Membuat objek baru dengan nilai default (0,0) dan (1,1)*/
    Garis(){
        this(new Titik(), new Titik(1,1));
        counterGaris++;
    }
    /*************** METHOD ***************/

    /* Mengembailkan banyak garis yang telah dibuat */
    static int getCounterGaris(){
        return counterGaris;
    }

    /* Mengembalikan nilai absis pada T1 */
    double getawalAbsis(){
        return awal.getAbsis();
    }

    /* Mengembalikan nilai ordinat pada T1 */
    double getawalOrdinat(){
        return awal.getOrdinat();
    }

    /* Mengembalikan nilai absis pada T2 */
    double getakhirAbsis(){
        return akhir.getAbsis();
    }

    /* Mengembalikan nilai ordinat pada T2 */
    double getakhirOrdinat(){
        return akhir.getOrdinat();
    }

    /* Mengubah nilai absis pada T1 */
    void setawalAbsis(double x){
        awal.setAbsis(x);
    }

    /* Mengubah nilai ordinat pada T1 */
    void setawalOrdinat(double y){
        awal.setOrdinat(y);
    }

    /* Mengubah nilai absis pada T2 */
    void setakhirAbsis(double x){
        akhir.setAbsis(x);
    }

    /* Mengubah nilai ordinat pad T2 */
    void setakhirOrdinat(double y){
        akhir.setOrdinat(y);
    }

    /* Menghitung jarak antar titik pada sebuah garis */
    double getjarak(){
        return Math.sqrt(Math.pow((akhir.getAbsis() - awal.getAbsis()), 2) + Math.pow((akhir.getOrdinat() - awal.getOrdinat()), 2));
    }
    
    /* Menghitung gradien garis */
    double getgradien(){
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    /* Mengembalikan titik tengah dari sebuah garis */
    void getTitikTengah(){
        double absis = (awal.getAbsis() + akhir.getAbsis())/2;
        double ordinat = (awal.getOrdinat() + akhir.getOrdinat())/2;

        System.out.println("(" + absis + "," + ordinat + ")");
    }

    /* Menilai apakah dua buah garis sejajar */
    boolean isSejajar(Garis G){
        return this.getgradien() == G.getgradien();
    }

    /* Menilai apakah dua buah garis tegak lurus */
    boolean istegaklurus(Garis G){
        return this.getgradien() * G.getgradien() == -1;
    }

    /* Mencetak nilai atribut pada garis */
    void printGaris(){
        System.out.println("(" + awal.getAbsis() + "," + awal.getOrdinat() + ")" + " - " + "(" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    /* Menampilkan pesamaan garis dalam bentuk string y = mx + c */
    void getPersamaan(){
        double m = this.getgradien();
        double c = (this.getawalOrdinat() - m * this.getawalAbsis());

        if(c < 0){
            System.out.println("y = " + m + "x " + c);
        }
        else{
            System.out.println("y = " + m + "x + " + c);
        }
    }
}
