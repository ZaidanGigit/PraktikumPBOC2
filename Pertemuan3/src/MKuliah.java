/* Nama File    : MKuliah.java
 * Deskripsi    : berisi file main 
 * pembuat      : Muhammad Zaidan Alfarizi
 * Tanggal      : 15 Maret 2026
 */
public class MKuliah{
    public static void main(String[] args){
        /* Mata Kuliah */
        MataKuliah PBO = new MataKuliah("PBO","pemrograman Berorientasi Objek",3);
        MataKuliah MBD = new MataKuliah("MBD","Manajemen Basis Data",3);
        MataKuliah Jarkom = new MataKuliah();

        System.out.println("idMatKul " + PBO.getnama() + " adalah " + PBO.getidMatKul() + " dengan SKS sebesar " + PBO.getSKS());

        Jarkom.setidMatKul("J");
        Jarkom.setnama("Jarkom");
        Jarkom.setSKS(3);

        System.out.println("idMatKul " + Jarkom.getnama() + " adalah " + Jarkom.getidMatKul() + " dengan SKS sebesar " + Jarkom.getSKS());

        /* Dosen */
        Dosen D1 = new Dosen ("123","Andi","Informatika");
        Dosen D2 = new Dosen();

        System.out.println("id dosen adalah" + D1.getNip() + " atas nama " + D1.getNama() + " dengan prodi " + D1.getProdi());

        D2.setNip("234");
        D2.setNama("Henri");
        D2.setProdi("Matematika");

        System.out.println("id dosen adalah" + D2.getNip() + " atas nama " + D2.getNama() + " dengan prodi " + D2.getProdi());

        /* Kendaraan */
        Kendaraan K1 = new Kendaraan ("H1234AB","motor");
        Kendaraan K2 = new Kendaraan();

        System.out.println("Plat Kendaraan adalah " + K1.getnoPlat() + " berjenis " + K1.getJenis());

        K2.setnoPlat("BH234AYC");
        K2.setJenis("motor");

        System.out.println("Plat Kendaraan adalah " + K2.getnoPlat() + " berjenis " + K2.getJenis());

        /* Mahasiswa */
        Mahasiswa M1 = new Mahasiswa ("234","Citra","Informatika");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah =" + M1.getJumlahSKS());
    }
}
