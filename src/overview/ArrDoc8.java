package overview;

import java.util.*;

public class ArrDoc8 {
    public static void main(String[] args) {
        List<String> listas = createList();
        List<List<String>> splittedList = splitList(listas);
        for(List<String> lis: splittedList){
            System.out.println("-----------------");
            printList(lis);
        }
    }

    private static void printList(List<String> listas){
        for (String a:listas){
            System.out.println(a);
        }
    }

    private static List<List<String>> splitList(List<String> lis){
        List<List<String>> listas = new ArrayList<>();
        List<String> templistone = new ArrayList<>();
        List<String> templisttwo = new ArrayList<>();
        for(int i = 0 ; i < lis.size(); i++){
            if(i < (lis.size()/2)){
                templistone.add(lis.get(i));
            }else{
                templisttwo.add(lis.get(i));
            }
        }
        listas.add(templistone);
        listas.add(templisttwo);
        return listas;
    }

    private static List<String> createList(){
        List<String> list = new ArrayList<>();
        list.add("Aaasdsdda");
        list.add("Bbbdegtsdf");
        list.add("CcccaDASD");
        list.add("Ddddwdrasdsad");
        list.add("Eeefsafsdf");
        list.add("Ffferfasa");
        list.add("Ggewgwe");
        list.add("Hhhwseras");
        list.add("Iiirtyte");
        list.add("Jjjertjtes");
        return list;
    }
}
