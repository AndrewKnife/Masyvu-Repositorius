package overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ArrDoc14 {

    private static Scanner scan = new Scanner(System.in);

    private static final String FILE_NAMES = "Duomenai/spalvos.txt";

    public static void main(String[] args) {
        HashMap<String, String> listas = getList();
        printHashMap(listas);

    }

    private static void printHashMap(HashMap<String, String> listas){
        System.out.println("Įveskite vardą");
        String name = scan.nextLine().toUpperCase();
        String color = "";
        try {
            color = listas.get(name);
        }catch (Exception e){
            System.out.println("Nerasta");
        }
        if(color != "" && color != null){
            System.out.println("Rasto žmogaus vardu "+name+" Mėgstamiausia spalva: "+color);
        }else{
            System.out.println("nerasta");
        }
    }

    private static HashMap<String, String> getList(){
        String line;
        String[] splat;
        HashMap<String, String> listas = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAMES))){
            while ((line = br.readLine())!= null){
                splat = line.split(" ");
                listas.put(splat[0].toUpperCase(), splat[1]);
            }
        }catch (IOException e){

        }
        return listas;
    }
}
