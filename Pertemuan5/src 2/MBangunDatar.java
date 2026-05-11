/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi main BangunDatar
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main (String[] args){
        /* Konstruktor */
        BangunDatar P1 = new Persegi(10, "Kuning", "Hitam");
        Persegi P2 = new Persegi(5, "Navy", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Hijau");
        Lingkaran L2 = new Lingkaran(14, "Biru", "Hitam");

        System.out.println("Luas P1 = " + P1.getLuas());
        System.out.println("Luas P2 = " + P2.getLuas());
        System.out.println("Keliling L1 = " + L1.getKeliling());
        System.out.println("Keliling L2 = " + L2.getKeliling());


        System.out.println("is Luas BD == P2: " + P1.isEqualLuas(P2));
        System.out.println("is Keliling L1 == L2: " + L1.isEqualKeliling(L2));

        ((Persegi) P1).zoomIn();
        P2.zoomOut();
        System.out.println("Sisi setelah dizoom in: " + ((Persegi)P1).getSisi());
        System.out.println("Sisi setelah dizoom out: " + ((Persegi)P2).getSisi());

        ((Lingkaran) L1).zoomIn();
        L2.zoomOut();
        System.out.println("Jari-jari setelah dizoom in: " + ((Lingkaran)L1).getJari());
        System.out.println("Jari-jari setelah dizoom out: " + ((Lingkaran)L2).getJari());

        ((Persegi)P1).zoom(50);
        System.out.println("Sisi setelah dizoom in: " + ((Persegi)P1).getSisi());
    }
}
