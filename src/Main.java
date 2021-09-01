import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hej med dig!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et tal: ");
        double a = scanner.nextDouble();
        System.out.print("Indtast endnu et tal: ");
        double b = scanner.nextDouble();
        double sum = a + b;
        double num = 2;
        double result = sum / num;
        System.out.println("Gennemsnittet af alle tal er: " + result);

        for (double i = 0; i < 10; i--) {
            System.out.print("Indtast endnu et tal: ");
            String c = scanner.next();
            if (c.equals("q") || c.equals("Q")){break;}
            else if(isNumeric(c)) {

                sum = Double.parseDouble(c) +sum;
                result = sum/ ++num;
                System.out.println("Gennemsnittet af alle tal er: " + result);
            } else {
                System.out.println("Det skal være et tal!");
            }
            }
    }

    public static boolean isNumeric(String string) {
        double intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
