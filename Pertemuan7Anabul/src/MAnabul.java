import java.util.ArrayList;

public class MAnabul {
    public static void main (String[] args){
        Anabul anabul1 = new Kucing("Kitty");
        Anabul anabul2 = new Anjing("Bobby");
        Anabul anabul3 = new Burung("Cici");

         ArrayList<Anabul> anabuls = new ArrayList<>();
        anabuls.add(anabul1);  
        anabuls.add(anabul2); 
        anabuls.add(anabul3);

        
        for (Anabul anabul : anabuls) {
            anabul.Bersuara(); 
            anabul.Gerak();   
            System.out.println(); 
        }
    }
}
