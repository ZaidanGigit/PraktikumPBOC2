/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 5 Maret 2026
 */
import java.util.ArrayList;
public class Mahasiswa{

    /* Atribut */
    private String NIM;
    private String nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    /* Konstruktor */

    /* Membuat objek mahasiswa dengan atribut default */
    public Mahasiswa(){
        this.NIM = "";
        this.nama = "";
        this.Prodi = "";
        this.listMatKul = new ArrayList<>();
        this.kendaraan = new Kendaraan();
        this.dosenWali = new Dosen();
    }

    /* Membuat objek mahasiswa dengan atribut berdasarkan input */
    public Mahasiswa(String NIM, String nama, String Prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.Prodi = Prodi;
        this.listMatKul = new ArrayList<>();
        this.kendaraan = new Kendaraan();
        this.dosenWali = new Dosen();
    }

    /* Selektor dan Mutator */

    /* Selektor NIM mahasiswa */
    public String getNIM() {
        return NIM;
    }

    /* Selektor Nama mahasiswa */
    public String getNama() {
        return nama;
    }

    /* Selektor Prodi mahasiswa */
    public String getProdi() {
        return Prodi;
    }

    /* Selektor DosenWali mahasiswa */
    public Dosen getDosenWali() {
        return dosenWali;
    }

    /* Selektor MataKuliah pada index ke-i mahasiswa */
    public MataKuliah getMataKuliah(int index){
        return listMatKul.get(index);
    }

    /* Selektor kendaraan mahasiswa */
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    /* Mengubah NIM mahasiswa */
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    /* Mengubah nama mahasiswa */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Mengubah prodi mahasiswa */
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    /* Mengubah DosenWali mahasiswa */
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    /* Mengubah kendaraan mahasiswa */
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    /* Method */

    /* Menambahkan matkul baru ke dalam list matkul */
    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    /* Menghitung jumlah SKS mata kuliah yang ada di listMatkul */
    public Integer getJumlahSKS(){
        Integer jumlahSKS = 0;
        for (MataKuliah matkul : listMatKul){
            jumlahSKS += matkul.getSKS();
        }
        return jumlahSKS;
    }

    /* Mengembalikan jumlah matkul yang ada di listMatKul */
    public Integer getJumlahMatKul(){
        return listMatKul.size();
    }

    /* Mencetak atribut mahasiswa */
    public void printMhs(){
        System.out.println("NIM:" + NIM);
        System.out.println("Nama:" + nama);
        System.out.println("Prodi:" + Prodi);
    }

    /* Mencetak atribut dan keseluruhan relasi mahasiswa */
    public void printDetailMhs(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " - " + kendaraan.getnoPlat());
        System.out.println("Mata Kuliah yang diambil:");
        int i = 0;
        for (i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getnama());
        }
    }
}
