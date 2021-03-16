package UnityConverter.Logic;

import UnityConverter.Interface.Convert;

import java.util.Scanner;

public class ConvertArea implements Convert {

    private final String[] unitsToConvert = new String[] {
            "cm^2 na m^2 i m^2 na cm^2",
            "m^2 na a i a na m^2",
            "a na Ha i Ha na a"
    };

    private final String metersToPower = "m^2";
    private final String cmetersToPower = "cm^2";
    private final String hektar = "Ha";
    private final String ar = "a";
    private final Scanner scanner = new Scanner(System.in);

    public ConvertArea(){}

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

        if(what.equals(cmetersToPower) && toWhat.equals(metersToPower)){

            less();

        }else if(what.equals(metersToPower) && toWhat.equals(cmetersToPower)){

            bigger();

        }else if(what.equals(metersToPower) && toWhat.equals(ar)){

            less();

        }else if(what.equals(ar) && toWhat.equals(metersToPower)){

            less();

        }else if(what.equals(hektar) && toWhat.equals(ar)){

            bigger();

        }else if(what.equals(ar) && toWhat.equals(hektar)){

            less();

        }

    }

    public void bigger(){
        System.out.println("Podaj liczbę");
        double howMuch1 = scanner.nextDouble();
        double result = howMuch1 * 100;

        System.out.println(result);
    }

    public void less(){
        System.out.println("Podaj liczbę");
        double howMuch1 = scanner.nextDouble();
        double result = howMuch1 / 100;

        System.out.println(result);
    }

}
