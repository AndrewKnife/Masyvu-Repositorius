package overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrDoc10 {

    private static Scanner scan = new Scanner(System.in);

    private static final String FILE_NAMES = "Duomenai/vardai.txt";

    public static void main(String[] args) {
        List<String> listas = getList();
        printFilterList(listas);

    }

    private static void printFilterList(List<String> listas){
        System.out.println("Pasirinkite iš kokios raidės vardus rodyti: ");
        String a = scan.nextLine().toUpperCase();
        String[] splat;
        boolean rado = false;
        for(String sd: listas){
            splat= sd.split("");
            if(splat[0].toUpperCase().equals(a)){
                System.out.println(sd);
                rado = true;
            }
        }
        if(!rado){
            System.out.println("Tokiu nera");
        }
    }

    private static List<String> getList(){
        String line;
        List<String> listas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAMES))){
            while ((line = br.readLine())!= null){
                listas.add(line);
            }
        }catch (IOException e){

        }
        return listas;
    }
}
