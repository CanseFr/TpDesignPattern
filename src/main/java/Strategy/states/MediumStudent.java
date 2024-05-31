package Strategy.states;

import Strategy.interfaces.Behavior;
import Strategy.entities.Student;

public class MediumStudent extends Student {
    public MediumStudent(Behavior comportement) {
        super(comportement);
    }

    @Override
    public void display() {
        System.out.println("Je suis un étudiant moyen.");
    }
}

