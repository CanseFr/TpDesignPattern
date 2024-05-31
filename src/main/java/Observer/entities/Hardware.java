package Observer.entities;

import Observer.interfaces.Observer;

public abstract class Hardware implements Observer {
    protected String name;

    public Hardware(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " affiche la météo : " + weather);
    }
}
