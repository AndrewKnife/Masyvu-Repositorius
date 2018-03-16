package overview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrDoc6 {
    public static void main(String[] args) {
        List<Integer> listas = kurtiLista();
        listas = mestiKasAntra(listas);
        for(Integer in: listas){
            System.out.println(in);
        }

    }

    private static List<Integer> mestiKasAntra(List<Integer> listas){
        int sk;
        int i = 1;
        Iterator<Integer> iterarorius = listas.iterator();
        while (iterarorius.hasNext()){
            sk = iterarorius.next();
            if(i % 2 == 0) {
                iterarorius.remove();
            }
            i++;
        }
        return listas;
    }

    private static List<Integer> kurtiLista(){
        List<Integer> listas = new ArrayList<>();
        listas.add(1);
        listas.add(2);
        listas.add(3);
        listas.add(4);
        listas.add(5);
        listas.add(6);
        listas.add(7);
        listas.add(8);
        listas.add(9);
        listas.add(10);
        return listas;
    }
}
