public class Kucing extends Anabul {
    public Kucing(){
        setNama("");
    }

    public Kucing (String nama){
        setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " melata");
    }

    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }
}
