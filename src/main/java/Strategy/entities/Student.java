package Strategy.entities;

import Strategy.interfaces.Behavior;

public abstract class Student {
    protected Behavior behavior;

    public Student(Behavior behavior) {
        this.behavior = behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void performBehavior() {
        behavior.toAct();
    }

    public abstract void display();
}

