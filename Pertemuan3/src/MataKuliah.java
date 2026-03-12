/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 15 Maret 2026
 */
public class MataKuliah {
    /* Atribut */
    private String idMatKul;
    private String nama;
    private Integer SKS;

    /* Konstruktor */
    
    /* Konstruktor MataKuliah dengan atribut berniali default */
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.SKS = 0;
    }

    /* Konstruktor MataKuliah dengan atribut bernilai sesuai dengan input */
    public MataKuliah(String idMatKul, String nama, Integer SKS){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    /* Selektor & Mutator */

    /* Mengembalikan idMatKul MataKuliah */
    public String getidMatKul(){
        return this.idMatKul;
    }
    
    /* Mengembalikan nama MataKuliah */
    public String getnama(){
        return this.nama;
    }

    /* Mengembalikan jumlah SKS MataKuliah */
    public Integer getSKS(){
        return this.SKS;
    }

    /* Mengubah idMatKul MataKuliah */
    public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    /* Mengubah nama MataKuliah */
    public void setnama(String nama){
        this.nama = nama;
    }
    
    /* Mengubah bobot SKS MataKuliah */
    public void setSKS(Integer SKS){
        this.SKS = SKS;
    }
}
