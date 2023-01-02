import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Wie viele Minions hast du? ");
        Scanner scanner = new Scanner(System.in);


        NumberFormat numberFormat = NumberFormat.getInstance();
        long outputMinion = 170_000;
        int amountMinion = scanner.nextInt();
        long outputDays = (outputMinion * amountMinion);
        long outputWeek = (outputDays * 7);


        System.out.println("----------------------------------");
        for (int i = 1; i < 53; i++) {

            System.out.println("Woche " + i + " | " + "Geld: " + numberFormat.format(i * outputWeek));

        }
        System.out.println("----------------------------------");
        System.out.println("Output in Tage: " + outputDays + " | " + "Output pro Woche: " + outputWeek);
    }
}

