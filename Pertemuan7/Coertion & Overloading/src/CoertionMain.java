/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Main Coertion
*/

public class CoertionMain {
    public static void main(String[] args){

        // POLIMORFISME AD HOC COERSION

        // Data integer
        int xInteger = 65;

        // integer ke char
        char intToChar = (char) xInteger;

        // integer ke double
        double intToDouble = (double) xInteger;

        /* String of char tidak bisa dikonversi ke integer
        // Data string
        String xString = "Pancong Pak Rahmat";

        // String ke integer
        int stringToInt = Integer.parseInt(xString);

        // String ke double
        int stringToDouble = Integer.parseInt(xString);
        */

        /*  
        Mengubah integer yang sudah dikonversi ke double, lalu mengubah kembali 
        bentuknya ke integer 
        */
        int doubleToInt = (int) intToDouble;

        // Data string
        String X = "1234";
        String Y = "5678";

        // Mengkonkatinasi data string
        String S = X + Y;

        // Mengonversi data string menjadi integer lalu dijumlahkan
        int Z = (Integer.parseInt(X) + Integer.parseInt(Y));

        // Data string
        String P = "12.34";
        String Q = "56.78";

        // Mengkonkat data string
        String R = P + Q;

        // Mengubah data string menjadi double lalu dijumlahkan
        double D = (Double.parseDouble(P) + Double.parseDouble(Q));

        int A = (Integer.parseInt(S));

        String T = Integer.toString(A);

        // Cetak Hasil
        System.out.println("Hasil konversi integer 65 ke char: " + intToChar);
        System.out.println("Hasil konversi integer 65 ke double: " + intToDouble);
        //System.out.println("Hasil konversi String 'Pancong Pak Rahmat' ke integer: " + stringToInt);
        //System.out.println("Hasil konversi String 'Pancong Pak Rahmat' ke double: " + stringToDouble);
        System.out.println("Hasil int yang sudah di konversi ke double lalu dikonversi lagi menjadi integer: " + doubleToInt);
        System.out.println("Hasil konkatinasi X dan Y: " + S);
        System.out.println("Hasil penjumlahan X dan Y: " + Z);
        System.out.println("Hasil konkatinasi P dan Q: " + R);
        System.out.println("Hasil penjumlahan P dan Q: " + D);
        System.out.println("Hasil konversi S ke integer: " + A);
        System.out.println("Hasil konversi A ke String: " + T);

        // POLIMORFISME AD HOC OVERLOADING
        Mahasiswa M1 = new Mahasiswa(1,"Zaimut","Fisika");
        Mahasiswa M2 = new Mahasiswa();
        Mahasiswa M3 = new Mahasiswa();

        // Eksekusi berbagai macam prosedur setProgramStudi
        M1.setProgramStudi();
        M2.setProgramStudi("Infotmatika");
        M3.setProgramStudi(M2);

        // Cetak data objek Mahasiswa
        M1.printInfo();
        M2.printInfo();
        M3.printInfo();
    }
}
