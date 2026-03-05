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
    Garis(Titik T1, Titik T2){
        this.awal = T1;
        this.akhir = T2;
        counterGaris++;
    }

    Garis(){
        this(new Titik(), new Titik(1,1));
        counterGaris++;
    }
    /*************** METHOD ***************/
    void printGaris(){
        System.out.println("(" + awal.getAbsis() + "," + awal.getOrdinat() + ")" + " - " + "(" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getawalAbsis(){
        return awal.getAbsis();
    }

    double getawalOrdinat(){
        return awal.getOrdinat();
    }

    double getakhirAbsis(){
        return akhir.getAbsis();
    }

    double getakhirOrdinat(){
        return akhir.getOrdinat();
    }

    void setawalAbsis(double x){
        awal.setAbsis(x);
    }

    void setawalOrdinat(double y){
        awal.setOrdinat(y);
    }

    void setakhirAbsis(double x){
        akhir.setAbsis(x);
    }

    void setakhirOrdinat(double y){
        akhir.setOrdinat(y);
    }

    double getjarak(){
        return Math.sqrt(Math.pow((akhir.getAbsis() - awal.getAbsis()), 2) + Math.pow((akhir.getOrdinat() - awal.getOrdinat()), 2));
    }

    double getgradien(){
        return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }

    boolean isSejajar(Garis G){
        return this.getgradien() == G.getgradien();
    }

    boolean istegaklurus(Garis G){
        return this.getgradien() * G.getgradien() == -1;
    }

}
