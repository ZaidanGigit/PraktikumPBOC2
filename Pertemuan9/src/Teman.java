/* 
Nama    : Muhammad Zaidan Alfarizi
NIM     : 24060124130102
Lab     : C2
tanggal : 30 Mei 2026
Desc    : File Class Teman
*/

import java.util.ArrayList;;

public class Teman {
    // Atribut
    private int nbelm;
    private ArrayList<String> Lnama;

    // Method
    // Konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // Selektor
    // Mengembalikan jumlah elemen
    public int getNbElm(){
        return this.nbelm;
    }

    // Mengembalikan Nama pada posisi indeks
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // Mutator
    // Menambahkan/Mengubah elemen pada Lnama
    public void setNama(int indeks, String nama){
        if(Lnama.get(indeks) == null && nama != null){
            nbelm++;
        }
        else if(Lnama.get(indeks) != null && nama == null){
            nbelm--;
        }
        Lnama.set(indeks, nama);
    }

    // Menambahkan nama pada bagian akhir larik
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    // Cetak semua elemen Lnama
    public void printInfo(){
        for(int i = 0; i < 100;i++){
            if(Lnama.get(i) != null){
                System.out.println("Indeks: " + i + " terdapat Nama: " +Lnama.get(i));
            }
        }
    }

    // Menghapus nama
    public void delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm--;
        }
    }

    // Mengecek apakah nama termasuk dalam teman
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    // Mengganti nama yang sudah ada menjadi nama yang baru
    public void gantiNama(String nama, String namaBaru){
        int idx = Lnama.indexOf(nama);
        this.setNama(idx, namaBaru);
    }

    // Mengembalikan jumlah nama yang ada di list
    public int countNama(String nama){
        int count = 0;
        for(String n : Lnama){
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    // Mencetak seluruh nama yang ada
    public void showTeman(){
        this.addNama("n/a");
        int idx = Lnama.indexOf("n/a");
        this.delNama("n/a");
        for(int i = 0; i < idx; i++){
            if(Lnama.get(i) != null){
                System.err.println("Nama: " + Lnama.get(i));
            }
        }

    }

}
