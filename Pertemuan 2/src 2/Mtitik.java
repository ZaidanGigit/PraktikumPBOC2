public class Mtitik {
    public static void main(String[] args) {
         //Membuat objek titik T1 (0,0)
        Titik T1 = new Titik();

        //mengubah absis T1 dengan nilai 3
        T1.setAbsis(3); 

        //mengubah ordinat T1 dengan nilai 4
        T1.setOrdinat(4);

        // mencetak koordinat T1 ke layar
        T1.printTitik(); 

        //menggeseer T1 sejauh (3,4)
        T1.geser(3,4);

        //menampilkan koordinat T1 setelah digeser
        T1.printTitik(); 

        Titik T2 = T1;

        //menampilkan koordinat T2
        T2.printTitik(); 
        T1.setAbsis(10);
        T1.setOrdinat(10);

        //menampilkan koordinat T2 setelah T1 diubah
        T2.printTitik();

        Titik T3 = new Titik(8,9);

        //menampilkan koordinat T3
        T3.printTitik(); 

        Titik T4 = new Titik(6,9);

        //menampilkan koordinat T4
        T4.printTitik(); 

        /* Mencetak jumlah titik yang sudah dibuat */
        System.out.println("Jumlah titik yang telah dibuat: " + Titik.getCounterTitik());

        /* Mencetak letak kuadran dimana titik T1 berada */
        System.out.println("Kuadran T1: " + T1.getKuadran());

        /* Mengembalikan jarak antara dua titik */
        System.out.println(T1.getJarak(T3));

        /* Mengembalikan nilai jarak sebuah titik dengan titik pusat */
        System.out.println(T3.getJarakPusat());

        /* Merefleksikan titik T4 terhadap sumbu x */
        T4.refleksiX();

        /* Mencetak titik T4 */
        T4.printTitik();

        /* Merefleksikan titik T3 terhadap sumbu y */
        T3.refleksiY();

        /* Mencetak titik T3 */
        T3.printTitik();

        /* Mencetak nilai refleksi x dan y pada titik t3 */
        System.out.println(T3.getRefelksiX());
        System.out.println(T3.getrefleksiY());
    } 
}