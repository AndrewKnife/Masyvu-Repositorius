package overview;

import java.util.LinkedList;
import java.util.List;

public class ArrDoc7 {
    public static void main(String[] args) {
        List<String> listas = new LinkedList<>();
        listas.add("Labas");
        listas.add("Ate");
        listas.add("Vidurys");
        listas.add("Ketvirtas");
        listas.add("Galas");
        listas.add(0,"Penki");
        listas.add((listas.size()), "Paskutinis");
        for(String stri : listas){
            System.out.println(stri);
        }
    }
}
