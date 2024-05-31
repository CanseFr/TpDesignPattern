package Strategy.states;

import Strategy.interfaces.Behavior;
import Strategy.entities.Student;

public class GoodStudent extends Student {
    public GoodStudent(Behavior comportement) {
        super(comportement);
    }

    @Override
    public void display() {
        System.out.println("Je suis un bon étudiant.");
    }
}

