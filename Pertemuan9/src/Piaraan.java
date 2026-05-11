/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Piaraan
*/

import java.util.LinkedList;

public class Piaraan {
    // Atribut
    private int nbelm;
    private final LinkedList<Anabul> lanabul;

    // Method
    public Piaraan(){
        lanabul = new LinkedList<>();
    }

    // Mengembalikan jumlah elemen pada lanabul
    public int getNbElm(){
        return nbelm;
    }

    // Menambah elemen pada lanabul pada bagian belakang queue
    public void enqueueAnabul(Anabul anabul){
        lanabul.addLast(anabul);
        nbelm++;
    }

    // Mengembalikan true jika anabul merupakan elemen dari queue
    public boolean isMember(Anabul anabul){
        return lanabul.contains(anabul);
    }

    // Mengembalikan anabul pada barisan terdepan
    public Anabul getAnabul(){
        return lanabul.peekFirst();
    }

    // Menghapus elemen pertama di queue
    public Anabul dequeueAnabul(){
        return lanabul.removeFirst();
    }

    // Menampilkan nama panggilan dari seluruh elemen lanabul
    public void showAnabul(){
        for(int i = 0; i < lanabul.size();i++){
            if(lanabul.get(i) != null){
                System.err.println("Panggilan: " + (lanabul.get(i)).getpanggilan());
            }
        }
    }

    // Menghitung jumlah objek Class Kucing dalam queue
    public int countKucing(){
        int count = 0;

        for(int i = 0; i < lanabul.size();i++){
            if(lanabul.get(i) instanceof Kucing){
                count++;
            }
        }

        return count;
    }

    // Mengembalikan total keseluruhan bobot kucing di queue
    public double bobotKucing(){
        double tbobot = 0;

        for(Anabul a : this.lanabul){
            if(a instanceof Kucing){
                Kucing k = (Kucing) a;
                tbobot = tbobot + k.getBobot();
            }
        }

        return tbobot;

    }

    // Menampilkan jenis class yang ada di queue
    public String getClass(Anabul anabul){
        if(anabul instanceof Kucing){
            return "Kucing";
        }
        else if(anabul instanceof Anjing){
            return "Anjing";
        }
        else if(anabul instanceof Burung){
            return "burung";
        }
        else{
            return "Bukan Anabul";
        }
    }

    // Mengembalikan nama panggilan dari sebuah anabul
    public String getName(Anabul anabul){
        return anabul.getpanggilan();
    }

    // Menampilkan jenis Anabul dari seluruh eemen yang ada di queue
    public void showJenisAnabul(){
        for(int i = 0; i < lanabul.size();i++){
            System.out.println("Nama: " + getName(lanabul.get(i)) + " dengan jenis Anabul: " + (String)getClass(lanabul.get(i)));
        }
    }
}
