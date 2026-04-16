/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 26 Maret 2026
 */

public abstract class BangunDatar {
    /* Atribut */
    protected int  jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* Konstruktor */

    public BangunDatar(){
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /* Selektor */

    public int getJmlSisi(){
        return this.jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
       return border;
    }

    /* Mutator */
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String Warna){
        this.warna = Warna;
    }

    public void setBorder(String Border){
        this.border = Border;
    }

    /* Fungsi */
    public abstract double getLuas();

    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi:" + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Bangun Datar: " + counterBangunDatar);
    }
}
