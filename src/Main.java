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
            b = scanner.nextDouble();
            sum = sum + b;
            result = sum/ ++num;
            System.out.println("Gennemsnittet af alle tal er: " + result);
        }
    }
}
