/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 23 April 2026
Deskripsi   : File Main
*/

public class CoertionMain {
    public static void main(String[] args){
        /* 
        // Integer to Double
        int y = 25;
        double output2 = y;
        System.out.println(output2);

        // Integer to Char
        int z = 78;
        char output3 = (char) z;
        System.out.println(output3);

        // Char to Doube
        char a = 'a';
        double output4 = a;
        System.out.println(output4);

        // Char to Integer
        char b = 'b';
        int output5 = (int) b;
        System.out.println(output5);

        // Double to Integer
        double x = 59.0;
        int output6 = (int) x;
        System.out.println(output6);

        // Double to Char
        double w = 17052006;
        char output7 = (char) w;
        System.out.println(output7);

        // AD HOC COERSION
        int nilai = 65;

        // ke Integer
        int keInt = (int) nilai;
        System.out.println(keInt);

        // ke char
        char keChar = (char) nilai;
        System.out.println(keChar);

        // ke Double
        double keDouble = (double) nilai;
        System.out.println(keDouble);

        // B
        int backToInt = (int) keDouble;
        System.out.println(backToInt);

        // C
        String X = "1234", Y = "5678";
        String S = X + Y;
        int xKeInt1 = (int) X;
        int xKeInt2 = (int) Y;
        int Z = (int) X + (int) Y;

        // D
        */

        // AD HOC OVERLOADING
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa();
        Mahasiswa M3 = new Mahasiswa();
        M1.setProgramStudi();
        M2.setProgramStudi("Infotmatika");
        M3.setProgramStudi(M2);


    }
}
