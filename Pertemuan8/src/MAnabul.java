/*
Nama        : Muhammad Zaidan Alfarizi
NIM         : 24060124130102
Tanggal     : 30 April 2026
Deskripsi   : File Main Anabul
*/

public class MAnabul {
    public static void main (String[] args){

        // CLASS GENERIK
        Datum<Anabul> data = new Datum<>(new Kucing("Mimi", 3.5));
        Datum<Anabul> data2 = new Datum<>(new Anjing("Miki"));

        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data.setIsi(new Anggora("Kiki", 4.2));
        data.tampilkanAnabul(data.getIsi());
        System.out.println();

        data2.tampilkanAnabul(data2.getIsi());
        System.out.println();

        // METHOD GENERIK
        System.out.println("Prosedur Tukar");
        Datum<Anabul> hewan1 = new Datum<>(new Kucing("Kitty", 4.5));
        Datum<Anabul> hewan2 = new Datum<>(new Anjing("Doggy"));

        OperatorGenerik.tukar(hewan1, hewan2);
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        Datum<Integer> angka1 = new Datum<>(6);
        Datum<Integer> angka2 = new Datum<>(7);

        OperatorGenerik.tukar(angka1, angka2);

        System.out.println(angka1.getIsi());
        System.out.println(angka2.getIsi());

        // LARIK GENERIK
        Data<Anabul> data4 = new Data<>();
        Anabul anabul1 = new Kucing("Miska",2.5);
        Anabul anabul2 = new Kucing("Pokemon",5.5);
        Anabul anabul3 = new Anjing("Melisa");
        Anabul anabul4 = new Anjing("Adel");

        System.out.println("Space");
        data4.setIsi(1,anabul1);
        System.out.println("Space");
        data4.setIsi(3,anabul2);
        System.out.println("Space");
        data4.setIsi(6,anabul3);
        System.out.println("Space");
        data4.setIsi(5,anabul4);
        System.out.println("Space");
        
        System.out.println(data4.getSize());
        data4.printInfo();
    }
}
