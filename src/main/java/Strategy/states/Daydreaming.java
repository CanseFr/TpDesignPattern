package Strategy.states;

import Strategy.interfaces.Behavior;

public class Daydreaming implements Behavior {
    @Override
    public void toAct() {
        System.out.println("Rêvasse durant la journée de cours.");
    }
}

