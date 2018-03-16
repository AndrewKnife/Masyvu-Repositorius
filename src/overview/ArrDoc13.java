package overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ArrDoc13 {

    private static Scanner scan = new Scanner(System.in);

    private static final String FILE_NAMES = "Duomenai/zmogai.txt";

    public static void main(String[] args) {
        HashMap<String, Integer> listas = getList();
        printHashMap(listas);

    }

    private static void printHashMap(HashMap<String, Integer> listas){
        String name = scan.nextLine().toUpperCase();
        int age = 0;
        try {
            age = listas.get(name);
        }catch (Exception e){
            System.out.println("Nerasta");
        }
        if(age != 0){
            System.out.println("Rasto žmogaus vardu "+name+" amžius: "+age);
        }else{
            System.out.println("nerasta");
        }
    }

    private static HashMap<String, Integer> getList(){
        String line;
        String[] splat;
        HashMap<String, Integer> listas = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAMES))){
            while ((line = br.readLine())!= null){
                splat = line.split(" ");
                listas.put(splat[0].toUpperCase(), Integer.parseInt(splat[1]));
            }
        }catch (IOException e){

        }
        return listas;
    }
}
