import java.util.Scanner;

public class Club {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = reader.nextInt();

        if (age > 17) {
            System.out.println("Välkommen in");
        } else if (age > 14){
            System.out.println("Du får åka moppe, men inte komma in på klubben");
        } else {
            System.out.println("Tyvärr, du är inte gammal nog");
        }

    }
}