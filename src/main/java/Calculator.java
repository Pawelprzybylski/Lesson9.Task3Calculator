import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("1. Dodawanie ");
        System.out.println("2. Odejmowanie ");
        System.out.println("3. Mnożenie ");
        System.out.println("4. Dzielenie ");
        int option = scanner.nextInt();

        System.out.println("Wprowadź pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Wynik dodawania to:" + firstNumber + " i " + secondNumber + " to " + MathOperations.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Wynik odejmowania to:" + firstNumber + secondNumber + MathOperations.substract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Wynik mnożenia to: " + firstNumber + secondNumber + MathOperations.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("Wynik dzielenia to: " + firstNumber + secondNumber + MathOperations.divide(firstNumber, secondNumber));
                break;
        }
    }

}
