/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Doseb
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 15 Maret 2026
 */
public class Dosen {

    /* Atribut */
    private String nip;
    private String nama;
    private String prodi;

    /* Konstruktor */

    /* Membuat objek dosen dengan atribut default */
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    /* Mmebuat objek dosen dengan atribut ditentukan lewat input */
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    /* Selektor & Mutator */

    /* Selektor nip dosen */
    public String getNip() {
        return nip;
    }

    /* Selektor nama dosen */
    public String getNama() {
        return nama;
    }

    /* Selektor prodi dosen */
    public String getProdi() {
        return prodi;
    }

    /* Mengubah nip dosen */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /* Mengubah nama dosen */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Mengubah prodi dosen */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }


}
