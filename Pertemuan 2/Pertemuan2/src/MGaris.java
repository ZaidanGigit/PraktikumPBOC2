public class MGaris {
    public static void main(String[] args){
        /* Konstruktor */
        Garis G1 = new Garis();

        /* printGaris */
        G1.printGaris();

        /* Mutator */
        G1.setawalAbsis(10);
        G1.setawalOrdinat(12);
        G1.setakhirAbsis(1);
        G1.setakhirOrdinat(1);

        /* printGaris */
        G1.printGaris();

        /* Selektor */
        System.out.println("Absis titik awal G1:" + G1.getawalAbsis());
        System.out.println("Ordinat titik awal G1:" + G1.getawalOrdinat());
        System.out.println("Absis titik akhir G1:" + G1.getakhirAbsis());
        System.out.println("Ordinat titik akhir G1:" + G1.getakhirOrdinat());

        /* getJarak */
        System.out.println("Jarak antar titk G1:" + G1.getjarak());

        /* getgradien */
        System.out.println("Gradien G1:" + G1.getgradien());

        /* getTitikTengah */
        G1.getTitikTengah();

        /* isSejajar */

        Garis G2 = new Garis(new Titik(10,12),new Titik(1,1));
        Garis G3 = new Garis(new Titik(3,4),new Titik(5,6));

        System.out.println("G1 sejajar dengan G2: " + G1.isSejajar(G2));
        System.out.println("G1 sejajar dengan G3: " + G1.isSejajar(G3));

       /* istegaklurus */
       Garis G4 = new Garis(new Titik(2,1),new Titik(3,3));
       Garis G5 = new Garis(new Titik(2,3),new Titik(4,2));

       System.out.println("G4 tegak lurus dengan G5: " + G4.istegaklurus(G5));
       System.out.println("G1 tegak lurus dengan G2: " + G1.istegaklurus(G2));

       /* getPersamaan */
       Garis G6 = new Garis(new Titik(-2,0),new Titik(0,4));
       G6.getPersamaan();
       G1.getPersamaan();

       /* getCounterGaris */
       System.out.println("Jumlah garis yang sudah dibuat: " + Garis.getCounterGaris());
    }
}
