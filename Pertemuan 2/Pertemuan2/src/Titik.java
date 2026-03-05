/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 19 Februari 2026
 */

import org.w3c.dom.css.Counter;

public class Titik {
    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************** METHOD ***************/
    //konstruktor untuk membuat titik (x,y)
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y; 
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0,0);
        counterTitik++;
    }
    
    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    double getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; //titik berada pada sumbu x atau y
        }
    }

    double getJarak(Titik T) {
        double jarak = Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
        return jarak;
    }

    double getJarakPusat(){
        double jarakPusat = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarakPusat;
    }

    void refleksiX(){
        ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }

    double getRefelksiX(){
        return -ordinat;
    }

    double getrefleksiY(){
        return -absis;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }
}