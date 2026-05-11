public class Burung extends Anabul {
    public Burung (){
        setNama("");
    }

    public Burung (String nama){
        setNama(nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung " + getNama() + " terbang ");
    }

    public void Bersuara(){
        System.out.println("Burung " + getNama() + " berbunyi cuit");
    }
}
