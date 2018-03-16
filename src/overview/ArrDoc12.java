package overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ArrDoc12 {

    private static Scanner scan = new Scanner(System.in);

    private static final String FILE_NAMES = "Duomenai/vardai.txt";

    public static void main(String[] args) {
        Set<String> listas = getList();
        printList(listas);

    }

    private static void printList(Set<String> listas){
        boolean rado = false;
        String[] splat;
        for(String sd: listas){
            splat= sd.split("");
            if(splat[splat.length-2].equals("a") && splat[splat.length-1].equals("s")){
                System.out.println(sd);
                rado = true;
            }
        }
        if(!rado){
            System.out.println("Tokiu nera");
        }
    }

    private static Set<String> getList(){
        String line;
        Set<String> listas = new HashSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAMES))){
            while ((line = br.readLine())!= null){
                listas.add(line);
            }
        }catch (IOException e){

        }
        return listas;
    }
}
