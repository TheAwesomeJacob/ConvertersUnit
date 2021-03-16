package UnityConverter.Logic;

import UnityConverter.Interface.Convert;

import java.util.Scanner;

public class ConvertWeight implements Convert {

    private final String[] unitsToConvert = new String[] {
            "kg na ton i ton na kg",
            "kg na gram i gram na kg",
            "kg na pound i pound na kg"
    };

    private final String kg = "kg";
    private final String ton = "ton";
    private final String gram = "gram";
    private final String pound = "pound";
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

        if(what.equals(kg) && toWhat.equals(ton)){

            double result = giveNumber();
            System.out.println("Wynik " + (result / 1000));

        }else if(what.equals(ton) && toWhat.equals(kg)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 1000));

        }else if(what.equals(kg) && toWhat.equals(gram)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 1000));

        }else if(what.equals(gram) && toWhat.equals(kg)){

            double result = giveNumber();
            System.out.println("Wynik " + (result / 1000));

        }else if(what.equals(kg) && toWhat.equals(pound)){

            double result = giveNumber();
            System.out.println("Wynik " + (result * 2.20462262));

        }else if(what.equals(pound) && toWhat.equals(kg)){

            double result = giveNumber();
            System.out.println("Wynik " + (result / 2.20462262));

        }

    }

    public double giveNumber(){
        System.out.println("Podaj liczbę");
        return scanner.nextDouble();
    }

}
