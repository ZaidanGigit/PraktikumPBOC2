/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Main 
*/

public class Main {
    public static void main (String[] args){
        // Pembuatan 2 objek dosen dan 5 objek Mahasiswa
        Dosen CD1 = new Dosen("Ade", "NIP001");
        Dosen CD2 = new Dosen("Asimtot", "NIP002");

        Mahasiswa CM1 = new Mahasiswa();
        CM1.setNama("Jokowi");
        CM1.setNIM("NIM001");
        CM1.setWali(CD1);

        Mahasiswa CM2 = new Mahasiswa();
        CM2.setNama("Prabowo");
        CM2.setNIM("NIM002");
        CM2.setWali(CD1);

        Mahasiswa CM3 = new Mahasiswa();
        CM3.setNama("Gibran");
        CM3.setNIM("NIM003");
        CM3.setWali(CD1);

        Mahasiswa CM4 = new Mahasiswa();
        CM4.setNama("Megawati");
        CM4.setNIM("NIM004");
        CM4.setWali(CD2);

        Mahasiswa CM5 = new Mahasiswa();
        CM5.setNama("SBY");
        CM5.setNIM("NIM005");
        CM5.setWali(CD2);

        // Tes registrasi
        Seminar S1 = new Seminar();
        S1.registrasi(CM1);
        S1.registrasi(CM2);
        S1.registrasi(CM3);
        S1.registrasi(CM4);
        S1.registrasi(CM5);
        S1.registrasi(CD1);
        S1.registrasi(CD2);

        // Menampilkan peserta pada Seminar
        S1.tampilPeserta();

        // Mencetak data Mahasiswa
        CM1.tampilDataMahasiswa();
        CM4.tampilDataMahasiswa();

        // Cetak jumlah peserta Mahasiswa pada Seminar
        System.out.println("Jumlah peserta Mahasiswa: " + S1.countMahasiswa());
    }
}
