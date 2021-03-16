package UnityConverter.Logic;

import UnityConverter.Interface.Convert;

import java.util.Scanner;

public class ConvertLength implements Convert {

    private final String[] unitsToConvert = new String[] {
            "cm na m i m na cm",
            "m na km i km na m",
            "cm na mm i mm na cm",
            "dm na cm i cm na dm",
            "m na dm i dm na m"
    };
    private final String meters = "m";
    private final String cMeters = "cm";
    private final String kiloMeters = "km";
    private final String milliMeters = "mm";
    private final String dmMeters = "dm";
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

        if(what.equals(cMeters) && toWhat.equals(milliMeters)){

            multiplyByTen();

        }else if(what.equals(milliMeters) && toWhat.equals(cMeters)){

            divedByTen();

        }else if(what.equals(meters) && toWhat.equals(cMeters)){

            multiplyByOneHundred();

        }else if(what.equals(cMeters) && toWhat.equals(dmMeters)){

            divedByTen();

        }else if(what.equals(dmMeters) && toWhat.equals(cMeters)){

            multiplyByTen();

        }else if(what.equals(dmMeters) && toWhat.equals(meters)){

            divedByTen();

        }else if(what.equals(meters) && toWhat.equals(dmMeters)){

            multiplyByTen();

        }else if(what.equals(kiloMeters) && toWhat.equals(meters)){

            divedByOneHundred();

        }else if(what.equals(meters) && toWhat.equals(kiloMeters)){

            multiplyByOneHundred();

        }else if(what.equals(cMeters) && toWhat.equals(meters)){

            divedByOneHundred();
        }
    }
    public double giveNumber(){
        System.out.println("Podaj liczbę");
        return scanner.nextDouble();
    }

    public void divedByTen(){

        double number = giveNumber() / 10;
        System.out.println("Wynik " + number);

    }
    public void multiplyByTen(){

        double number = giveNumber() * 10;
        System.out.println("Wynik " + number);

    }
    public void divedByOneHundred(){

        double number = giveNumber() / 100;
        System.out.println("Wynik " + number);

    }
    public void multiplyByOneHundred(){

        double number = giveNumber() * 100;
        System.out.println("Wynik " + number);

    }

}
