package Decorator.decorators;

import Decorator.interfaces.ElementTree;

public class Ball extends ElementDecorator {
    public Ball(ElementTree tree) {
        super(tree);
    }

    @Override
    public void display() {
        tree.display();
        System.out.println("Ajout d'une boule");
    }
}

