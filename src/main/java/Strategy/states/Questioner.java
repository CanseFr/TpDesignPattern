package Strategy.states;

import Strategy.interfaces.Behavior;

public class Questioner implements Behavior {
    @Override
    public void toAct() {
        System.out.println("Pose beaucoup de questions durant la journée de cours.");
    }
}

