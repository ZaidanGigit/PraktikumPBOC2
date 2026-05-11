/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Main
*/

public class Main {
    public static void main(String[] args){
        // KOLEKSI KELAS DASAR
        Teman T1 = new Teman();
        Teman T2 = new Teman();

        T1.addNama("Cipung");
        T1.addNama("Mei Mei");
        T1.setNama(1,"Monyet");
        T2.addNama("Meong");
        T2.addNama("Miska");
        T2.setNama(1,"Polo");

        System.out.println("Nama elemen pada indeks 2 di T1: " +T1.getNama(1));
        System.out.println("Nama elemen pada indeks 2 di T2: " + T2.getNama(1));

        System.out.println(T1.getNbElm());

        T1.delNama("Cipung");
        System.out.println("Apakah nama Polo terdapat di T1? " +T2.isMember("Polo"));
        T2.gantiNama("Meong", "Melisa");
        T1.addNama("Mei Mei");
        T1.addNama("Mei Mei");
        System.out.println("Jumlah nama Mei Mei: " +T1.countNama("Mei Mei"));
        T1.showTeman();

        System.out.println("BATAS KOLEKSI KELAS DASAR");

        // KOLEKSI KELAS BENTUKAN
        Piaraan P1 = new Piaraan();
        Piaraan P2 = new Piaraan();

        Anabul K1 = new Kucing("Oyen", 4.5);
        Anabul K2 = new Kucing("Milo", 3.8);
        Anabul A3 = new Anjing("Doggy");
        Anabul B1 = new Burung("Rio");
        Anabul KT1 = new Kembangtelon("Belang", 3.2);
        Anabul Ag1 = new Anggora("Snowy", 2.7);
        Anabul Ag2 = new Anggora("Luna", 3.1);

        P1.enqueueAnabul(K1);
        P1.enqueueAnabul(K2);
        P1.enqueueAnabul(A3);
        P1.enqueueAnabul(KT1);

        P2.enqueueAnabul(B1);
        P2.enqueueAnabul(Ag1);
        P2.enqueueAnabul(Ag2);

        System.out.println("Jumlah Anabul di P1: " + P1.getNbElm());
        System.out.println("Jumlah Anabul di P2: " + P2.getNbElm());

        System.out.println("Apakah K1 anggota P1? " + P1.isMember(K1));
        System.out.println("Apakah Ag1 anggota P1? " + P1.isMember(Ag1));
        System.out.println("Apakah Ag1 anggota P2? " + P2.isMember(Ag1));

        System.out.println("Anabul pertama di P1: " + P1.getAnabul().getpanggilan());
        System.out.println("Anabul pertama di P2: " + P2.getAnabul().getpanggilan());

        System.out.println("Daftar panggilan Anabul di P1:");
        P1.showAnabul();

        System.out.println("Daftar panggilan Anabul di P2:");
        P2.showAnabul();

        System.out.println("Jumlah Kucing di P1: " + P1.countKucing());
        System.out.println("Jumlah Kucing di P2: " + P2.countKucing());

        System.out.println("Total bobot Kucing di P1: " + P1.bobotKucing());
        System.out.println("Total bobot Kucing di P2: " + P2.bobotKucing());

        System.out.println("Jenis K1: " + P1.getClass(K1));
        System.out.println("Jenis A3: " + P1.getClass(A3));
        System.out.println("Jenis B1: " + P2.getClass(B1));
        System.out.println("Jenis Ag1: " + P2.getClass(Ag1));

        System.out.println("Nama K1: " + P1.getName(K1));
        System.out.println("Nama A3: " + P1.getName(A3));
        System.out.println("Nama B1: " + P2.getName(B1));

        System.out.println("Jenis semua Anabul di P1:");
        P1.showJenisAnabul();

        System.out.println("Jenis semua Anabul di P2:");
        P2.showJenisAnabul();

        Anabul keluarP1 = P1.dequeueAnabul();
        System.out.println("Anabul yang keluar dari P1: " + keluarP1.getpanggilan());

        System.out.println("Jumlah Anabul di P1 setelah dequeue: " + P1.getNbElm());

        System.out.println("Daftar Anabul P1 setelah dequeue:");
        P1.showAnabul();

        System.out.println("Gerak dan suara Anabul pertama di P1 setelah dequeue:");
        P1.getAnabul().Gerak();
        P1.getAnabul().Bersuara();

        System.out.println("BATAS KOLEKSI KELAS BENTUKAN");
    }
}
