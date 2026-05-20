/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Generik Data
*/

public class Data<T> {
    // Atribut
    private static int KAPASITAS = 100;
    private  T[] ruang;
    private int banyak;

    // Konstruktor larik data
    @SuppressWarnings("unchecked")
    public Data(){
        this.ruang = (T[]) new Object[KAPASITAS];
        this.banyak = 0;
    }

    // Selektor, Mengembalikan nilai elemen pada posisi sesuai input
    public T getIsi(int posisi){
        if(posisi > banyak){
            System.out.println("Posisi melebihi kapasitas ruang");
            return null;
        }
        else{
            return ruang[posisi - 1];
        }
    }

    // Mutator, Mengubah nilai elemen pada posisi sesuai input
    public void setIsi(int posisi, T data){
        if(posisi >= 1 && posisi < KAPASITAS){
            if(ruang[posisi - 1] == null && data != null){
                banyak++;
            }
            else if(ruang[posisi - 1] != null && data == null){
                banyak--;
            }

            ruang[posisi - 1] = data;
        }
        else{
            System.out.println("Posisi melebihi kapasitas ruang");
        }
    }

    // Mengembalikan banyak data di larik
    public int getSize(){
        return this.banyak;
    }

    // Mencetak isi larik
    public void printInfo(){
        for(int i = 0; i < KAPASITAS; i++){
            if (ruang[i] != null){
                System.out.println("Posisi " + (i + 1) + ": " + ruang[i]);
            }
        }
    }

}
