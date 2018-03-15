package overview;

import java.util.EnumSet;
import java.util.Scanner;

enum Dienos{
    PIRMADIENIS(1),
    ANTRADIENIS(2),
    TRECIADIENIS(3),
    KETVIRTADIENIS(4),
    PENKTADIENIS(5),
    SESTADIENIS(6),
    SEKMADIENIS(7);

     public  static EnumSet<Dienos> savaite (){
         return EnumSet.allOf(Dienos.class);
     }

     private  int in;
     Dienos(int in){
         this.in = in;
     }

    public int getIn(int sk) {
        return in;
    }
}
public class ArrDoc5 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Iveskite skaičių");

        int sk = scan.nextInt();
        EnumSet<Dienos> diena = Dienos.savaite();
        for(Dienos a: Dienos.savaite()){
            if(sk == a.getIn(sk)){
                System.out.println(a);
            }
        }
    }
}
