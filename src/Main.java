import java.util.Scanner;  //Ermöglicht die eingabe in die Konsole

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gibt den Text aus
        System.out.println("Rechner:");
        System.out.println("Gib zwei Zahlen ein.:");

        // Erwarte Benutzereingabe
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Errechne das Ergebnis der 2 Nummern
        double ergebnis = num1 + num2;

        // Gib das Ergebnis aus
        System.out.println("Ergebnis: " + ergebnis);
    }
}