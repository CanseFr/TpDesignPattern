package Strategy.states;

import Strategy.interfaces.Behavior;
import Strategy.entities.Student;

public class BadStudent extends Student {
    public BadStudent(Behavior comportement) {
        super(comportement);
    }

    @Override
    public void display() {
        System.out.println("Je suis un mauvais étudiant.");
    }
}

