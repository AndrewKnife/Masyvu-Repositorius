package overview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrDoc11 {

    private static final String FILE_NAMES = "Duomenai/vardai.txt";

    public static void main(String[] args) {
        List<String> listas = getList();
        Collections.sort(listas);
        for(String sd: listas){
            System.out.println(sd);
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
