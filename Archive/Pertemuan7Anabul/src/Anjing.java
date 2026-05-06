public class Anjing extends Anabul {
    public Anjing (){
        setNama("");
    }

    public Anjing (String nama){
        setNama(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Anjing " + getNama() + " melata");
    }

    public void Bersuara(){
        System.out.println("Anjing " + getNama() + " berbunyi guk guk");
    }
}
