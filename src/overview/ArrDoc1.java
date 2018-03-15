package overview;

import java.util.ArrayList;
import java.util.List;

public class ArrDoc1 {
    public static void main(String[] args) {
        List<String> listas = new ArrayList<>();
        listas.add("Andrejus");
        listas.add("Meda");
        listas.add("Tomas");
        listas.add("Ponas");
        listas.add("Vakanda");
        listas.add("Valerijonas");
        for (int i = 0; i < listas.size(); i++){
            if(listas.get(i).length() > 6) {
                System.out.println(listas.get(i));
            }
        }
    }
}
