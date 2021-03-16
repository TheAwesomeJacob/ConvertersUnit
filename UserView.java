package UnityConverter.View;

import java.util.InputMismatchException;
import java.util.Scanner;
import UnityConverter.Logic.*;

public class UserView {

    private final Scanner scanner = new Scanner(System.in);

    public void viewConversion(){
        System.out.println("Witaj w programie przeliczającym różne jednostki");
        System.out.println("==================");
        System.out.println("\"Podane przykłady konwersji jednostek są odpowiednikiem wpisania wartości do zmiany\"");
        System.out.println("==================");
        System.out.println("Konwertowanie czego na czego Cię interesuje?");
        System.out.println("Konwersja powierzchni ---- wpisz numer 1");
        System.out.println("Konwersja długości ---- wpisz numer 2");
        System.out.println("Konwersja wagi ---- wpisz numer 3");
        System.out.println("Konwersja pojemności różnych płynów ---- wpisz numer 4");
        try {
            int number = scanner.nextInt();

            switch (number) {
                case 1 -> {
                    ConvertArea convertArea = new ConvertArea();
                    convertArea.convert();
                }
                case 2 -> {
                    ConvertLength convertLength = new ConvertLength();
                    convertLength.convert();
                }
                case 3 -> {
                    ConvertWeight convertWeight = new ConvertWeight();
                    convertWeight.convert();
                }
                case 4 -> {
                    ConvertDrink convertDrink = new ConvertDrink();
                    convertDrink.convert();
                }
            }
        }catch(InputMismatchException ex){
                System.out.println("Wpisano złą wartość do konsoli!!! " + ex);
            }
    }
}
