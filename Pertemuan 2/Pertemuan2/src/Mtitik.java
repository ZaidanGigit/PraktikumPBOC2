public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeseer T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        Titik T2 = T1;
        T2.printTitik(); //menampilkan koordinat T2
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); //menampilkan koordinat T2 setelah T1 diubah
        Titik T3 = new Titik(8,9);
        T3.printTitik(); //menampilkan koordinat T3
        Titik T4 = new Titik(6,9);
        T4.printTitik(); //menampilkan koordinat T4
        System.out.println("Jumlah titik yang telah dibuat: " + Titik.getCounterTitik());
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println(T1.getJarak(T3));
        System.out.println(T3.getJarakPusat());
        T4.refleksiX();
        T4.printTitik();
        T3.refleksiY();
        T3.printTitik();
        System.out.println(T3.getRefelksiX());
        System.out.println(T3.getrefleksiY());
    } 
}