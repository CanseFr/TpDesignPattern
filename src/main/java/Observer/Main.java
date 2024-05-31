package Observer;

import Observer.art.Asci;
import Observer.entities.*;
import Observer.interfaces.Observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 2 : Observer. \n");

        WeatherStation weatherStation = new WeatherStation();

        Observer phone = new Phone();
        Observer laptop = new Laptop();
        Observer tablet = new Tablet();
        Observer car = new Car();

        weatherStation.addObserver(phone);
        weatherStation.addObserver(laptop);
        weatherStation.addObserver(tablet);
        weatherStation.addObserver(car);

        System.out.println("Alert general 1 :");
        weatherStation.setWeather("Il va faire tout noir\n");
        System.out.println("-------------");

        System.out.println("Alert general 2 :");
        weatherStation.setWeather("Beau\n");
        System.out.println("-------------");

        System.out.println("Alert general 3 :");
        weatherStation.setWeather("Pas beau\n");
        System.out.println("-------------");

        System.out.println("Alert general 4 :");
        weatherStation.setWeather("Chaud Chaud\n");

        System.out.println(" ----------------------------------------------------------------------------------------------------");
        System.out.println("| On doit constater dans le terminal que chaque hardware est notifié au moment ou un etat est setté |");
        System.out.println(" ----------------------------------------------------------------------------------------------------");

        Asci.asci();

    }
}