package UnityConverter.Logic;

import UnityConverter.Interface.Convert;

import java.util.Scanner;

public class ConvertDrink implements Convert {

    private final String[] unitsToConvert = new String[] {
            "l na mml i ml na l",
            "hl na l i l na hl",
            "l na gallon i gallon na l"
    };

    private final String liter = "l";
    private final String mileLiter = "ml";
    private final String hectoLiter = "hl";
    private final String gallon = "gallon";
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void convert() {

        System.out.println("Możliwe wersje konwersji: ");
        for (String k: unitsToConvert) {
            System.out.println(k);
        }

        System.out.println("Wybierz co na co chcesz przekonwertować: ");
        String what = scanner.nextLine();
        System.out.println("Na");
        String toWhat = scanner.nextLine();

        if(what.equals(liter) && toWhat.equals(mileLiter)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 1000));

        }else if(what.equals(mileLiter) && toWhat.equals(liter)){

            double result = giveNumber();
            System.out.println("Wynik " + (result / 1000));

        }else if(what.equals(hectoLiter) && toWhat.equals(liter)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 100));

        }else if(what.equals(liter) && toWhat.equals(hectoLiter)){

            double result = giveNumber();
            System.out.println("Wynik " + (result / 100));

        }else if(what.equals(liter) && toWhat.equals(gallon)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 0.22));

        }else if(what.equals(gallon) && toWhat.equals(liter)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 4.54609));

        }

    }

    public double giveNumber(){
        System.out.println("Podaj liczbę");
        return scanner.nextDouble();
    }
}
