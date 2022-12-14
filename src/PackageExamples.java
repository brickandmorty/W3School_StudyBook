import java.util.Scanner;
public class PackageExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie unten Ihren vollständigen Namen ein: ");

        String userEingabe = scanner.nextLine();
        System.out.println("Hallo, " + userEingabe + "! ;-)");

    }
}
