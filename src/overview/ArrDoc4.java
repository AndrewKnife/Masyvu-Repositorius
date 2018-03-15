package overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Vartotojus{
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    Vartotojus(String vardas, String pavarde, int amzius, String miestas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.miestas = miestas;

    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(vardas + " "+ pavarde+ " "+ amzius +" "+ miestas );
        return builder.toString();
    }

    public static Comparator<Vartotojus> sortByName = new Comparator<Vartotojus>() {
        @Override
        public int compare(Vartotojus o1, Vartotojus o2) {
            return o1.getVardas().compareTo(o2.getVardas());
        }
    };
}

public class ArrDoc4 {
    public static void main(String[] args) {
        Vartotojus vart = new Vartotojus("Jonas","Jonaitis", 25, "Kaunas");
        List<Vartotojus> listass = new ArrayList<>();
        listass.add(vart);
        vart = new Vartotojus("Antanas","Jonaitis", 45, "Vilnius");
        listass.add(vart);
        vart = new Vartotojus("Bombus","Komnis", 29, "Vilnius");
        listass.add(vart);
        Collections.sort(listass, Vartotojus.sortByName);
        for(Vartotojus varter : listass){
            System.out.println(varter.toString());
        }

    }
}
