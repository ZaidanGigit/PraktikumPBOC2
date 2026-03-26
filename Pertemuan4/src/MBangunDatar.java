/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi main BangunDatar
 * pembuat      : Muhammad Zaidan Alfarizi
 * NIM          : 24060124130102
 * Tanggal      : 12 Maret 2026
 */

public class MBangunDatar {
    public static void main (String[] args){
        /* Konstruktor */

        /* Bangun Datar */
        BangunDatar BD1 = new BangunDatar();
        BangunDatar BD2 = new BangunDatar(5, "Merah", "Hitam");
        
        /* Persegi */
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(4,"Putih","Coklat");

        /* Lingkaran */
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(10, "Kuning", "Orange");

        /* Mencetak Data */
        BD2.printInfo();
        P2.printInfo();
        L2.printInfo();

        /* Mutator Bangun Datar */
        BD1.setWarna("Biru");
        BD1.setBorder("Hijau");
        BD1.setJmlSisi(3);

        /* Mutator Lingkaran */
        L1.setJari(15);
        L1.setJmlSisi(5);
        L1.setWarna("Hitam");
        L1.setBorder("Navy");

        /* Mutator Persegi */
        P1.setSisi(10);
        P1.setWarna("Kuning");
        P1.setBorder("Light Blue");
        P1.setJmlSisi(4);

        /* PrintInfo Bangun Datar */
        BD1.printInfo();

        /* PrintInfo Persegi */
        P1.printInfo();

        /* PrintInfo Lingkaran */
        L1.printInfo();

        /* Method Persegi */
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Keliling Persegi: " + P2.getKeliling());
        System.out.println("Diagonal Persegi: " + P1.getDiagonal());

        /* Method Lingkaran */
        System.out.println("Luas Lingkaran: " + L1.getLuas());
        System.out.println("Keliling Lingkaran: " + L2.getKeliling());

    }
}
