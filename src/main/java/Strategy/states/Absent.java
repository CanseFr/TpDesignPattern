package Strategy.states;

import Strategy.interfaces.Behavior;

public class Absent implements Behavior {
    @Override
    public void toAct() {
        System.out.println("Est absent durant la journée de cours.");
    }
}

