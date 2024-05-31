package Observer.entities;

import Observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers;
    private String weather;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}

