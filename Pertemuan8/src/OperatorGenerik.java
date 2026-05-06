/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Class Operator Generik
*/

public class OperatorGenerik {
    // Method Generik
    public static <T> void tukar (Datum<T> a, Datum<T>b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
