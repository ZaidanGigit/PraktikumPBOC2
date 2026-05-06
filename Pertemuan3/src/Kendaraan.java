/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 5 Maret 2026
 */
public class Kendaraan {
    /* Atribut */
    private String noPlat;
    private String jenis;

    /* Konstruktor */

    /* Membuat objek kendaraan dengan atribut default */
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    /* Membuat objek kendaraan dengan atribut berdasarkan dengan input */
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    /* Selektor & Mutator */

    /* Selektor noPlat kendaraan */
    public String getnoPlat(){
        return noPlat;
    }

    /* Selektor jenis kendaraan */
    public String getJenis(){
        return jenis;
    }

    /* Mengubah data noPLat kendaraan */
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    /* Mengubah data jenis kendaraan */
    public void setJenis (String jenis){
        this.jenis = jenis;
    }
}
