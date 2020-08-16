import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MeningsBygg {
    /*
    * En klass som kan bygga meningar från adjektiv och substantiv och verb
    * */

    // Vi måste skapa våra listor där vi ska lägga våra ord
    static ArrayList<String> substantivLista = new ArrayList<String>();
    static ArrayList<String> adjektivLista = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException {
        // Vi måste öppna våra filer
        File substantivFil = new File("/Users/joakimloxdal/Documents/javakurs/lektion3/Meningsbyggare/MeningsByggare/src/substantiv.txt");
        File adjektivFil = new File("/Users/joakimloxdal/Documents/javakurs/lektion3/Meningsbyggare/MeningsByggare/src/adjektiv.txt");


        // Vi måste skapa scanners för att läsa filerna
        Scanner reader1 = new Scanner(substantivFil);
        Scanner reader2 = new Scanner(adjektivFil);

        // Vi måste få orden från filerna in i våra listor
        while (reader1.hasNextLine()) {
            substantivLista.add(reader1.nextLine());
        }

        while (reader2.hasNextLine()) {
            adjektivLista.add(reader2.nextLine());
        }

        byggMening();
        byggMening();
        byggMening();

    }

    public static void byggMening() {
        Random rand = new Random();
        String adjektiv =  adjektivLista.get(rand.nextInt(adjektivLista.size()));
        String substantiv =  substantivLista.get(rand.nextInt(substantivLista.size()));
        System.out.println(adjektiv + " " + substantiv);
    }

}
