package Strategy.states;

import Strategy.interfaces.Behavior;

public class Sleeper implements Behavior {
    @Override
    public void toAct() {
        System.out.println("Dort durant la journée de cours.");
    }
}

