/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;

    /*************** METHOD ***************/
    //konstruktor untuk membuat titik (0,0)
    Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
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

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public class MTitik {
        public static void main(String[] args) {
            Titik t1 = new Titik(); //Membuat objek titik T1 (0,0)
            t1.setAbsis(3); //mengubah absis T1 dengan nilai 3
            t1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
            t1.printTitik(); // mencetak koordinat T1 ke layar
            t1.geser(3,4); //menggeseer T1 sejauh (3,4)
            t1.printTitik(); //menampilkan koordinat T1 setelah digeser
        }
    }
}