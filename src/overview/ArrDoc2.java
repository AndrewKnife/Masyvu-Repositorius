package overview;

import java.util.ArrayList;
import java.util.List;

public class ArrDoc2 {
    public static void main(String[] args) {
        List<String> listas = new ArrayList<>();
        listas.add("Andrejus");
        listas.add("Meda");
        listas.add("Tomas");
        listas.add("Ponas");
        listas.add("Vakanda");
        listas.add("Valerijonas");
        printFirst(listas);
        printLast(listas);
    }

    private static void printFirst(List<String> listas){
        System.out.println("Pirmas list elementas: "+listas.get(0));
    }

    private static void printLast(List<String> listas){
        System.out.println("Paskutinis list elementas: "+listas.get(listas.size()-1));
    }
}
