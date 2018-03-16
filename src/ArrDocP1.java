
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ArrDocP1 {

    private static final String FILE_NAMES = "Duomenai/klausimai.txt";

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<String[]> listas = getList();
        klausineti(listas);
    }

    private static void klausineti(List<String[]> listas) {
        boolean baigta = false;
        List<Integer> baigti = new ArrayList<>();
        int rezultatas = 0;
        Random ran = new Random();
        int klausimonr;
        boolean yra;
        String atsakymas;

        for (int k = 0; k < 10 ; k++) {
            while (true) {
                yra = false;
                klausimonr = ran.nextInt(listas.size());
                if (baigti.size() != 0) {
                    for (int i : baigti) {

                        if(klausimonr == i){
                            yra = true;
                        }else{
                        }

                    }
                    if(yra){

                    }else{
                        break;
                    }

                } else {
                    break;
                }
            }
            System.out.println("Klausimas Nr."+(k+1));
            System.out.println(listas.get(klausimonr)[0]);
            System.out.println("Pasirinkite variantą: ");
            for(int i = 1 ; i < (listas.get(klausimonr).length-1);i++){
                System.out.println(listas.get(klausimonr)[i]);
            }

            atsakymas = scan.nextLine().replace(" ","");
            if(atsakymas.equals((listas.get(klausimonr)[listas.get(klausimonr).length-1]).replace(" ", ""))){
                rezultatas++;
            }else{

            }

            baigti.add(klausimonr);

        }
        System.out.println("Jūsų rezultatas: "+rezultatas);
    }

    private static List<String[]> getList() {
        String line;
        String[] splat;
        List<String[]> listas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAMES))) {
            while ((line = br.readLine()) != null) {
                splat = line.split(";");
                listas.add(splat);
            }
        } catch (IOException e) {

        }
        return listas;
    }
}
