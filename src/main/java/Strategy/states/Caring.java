package Strategy.states;

import Strategy.interfaces.Behavior;

public class Caring implements Behavior {
    @Override
    public void toAct() {
        System.out.println("Est très attentionné durant la journée de cours.");
    }
}

