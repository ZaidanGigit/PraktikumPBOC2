/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Class Seminar
*/

import java.util.ArrayList;

public class Seminar {
    // Atribut
    private static ArrayList<Civitasakademika> pesertas = new ArrayList<>();
    private int banyakPeserta;

    // Method 

    // Konstruktor
    public Seminar (){
        this.banyakPeserta = 0;
    }

    // Jumlah peserta keseluruhan
    public int countPeserta(){
        return this.banyakPeserta;
    }

    // Prosedur registrasi peserta seminar
    public void registrasi(Civitasakademika objek){
        if(pesertas.size() <= 100){
            pesertas.add(objek);
            this.banyakPeserta++;
        }
        else{
            System.out.println("Pendaftaran penuh");
        }
    }

    // Cetak semua peserta seminar
    public void tampilPeserta(){
        System.out.println("Peserta seminar: ");
        for(int i = 0; i < pesertas.size(); i++){
            System.out.println("Nama Peserta: " + pesertas.get(i).getNama() + ", Nomor Peserta: " + pesertas.get(i).getNomor());
        }
    }

    // Menghitung jumlah peserta Seminar Mahasiswa 
    public int countMahasiswa(){
        int jumlahMahasiswa = 0;
        for (int i = 0; i < pesertas.size(); i++) {
            if (pesertas.get(i) instanceof Mahasiswa) {
                jumlahMahasiswa++;
            }
        }
        return jumlahMahasiswa;
    }
}
