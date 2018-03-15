package overview;

class Vartotojas{
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    Vartotojas(String vardas, String pavarde, int amzius, String miestas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.miestas = miestas;

    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(vardas + " "+ pavarde+ " "+ amzius +" "+ miestas );
        return builder.toString();
    }
}

public class ArrDoc3 {
    public static void main(String[] args) {
        Vartotojas vart = new Vartotojas("Jonas","Jonaitis", 25, "Kaunas");
        System.out.println(vart.toString());
    }
}
