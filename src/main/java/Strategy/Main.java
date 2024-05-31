package Strategy;

import Strategy.art.Asci;
import Strategy.entities.Student;
import Strategy.interfaces.Behavior;
import Strategy.states.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 5 : Strategy. \n");

        Behavior daydreaming = new Daydreaming();
        Behavior caring = new Caring();
        Behavior questioner = new Questioner();
        Behavior sleeper = new Sleeper();
        Behavior absent = new Absent();

        Student goodStudent = new GoodStudent(caring);
        Student mediumStudent = new MediumStudent(questioner);
        Student badStudent = new BadStudent(sleeper);

        goodStudent.display();
        goodStudent.performBehavior();

        mediumStudent.display();
        mediumStudent.performBehavior();

        badStudent.display();
        badStudent.performBehavior();

        goodStudent.setBehavior(daydreaming);
        goodStudent.performBehavior();

        mediumStudent.setBehavior(absent);
        mediumStudent.performBehavior();

        Asci.asci();
    }
}