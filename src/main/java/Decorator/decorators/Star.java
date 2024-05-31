package Decorator.decorators;

import Decorator.interfaces.ElementTree;

public class Star extends ElementDecorator {
    public Star(ElementTree tree) {
        super(tree);
    }

    @Override
    public void display() {
        tree.display();
        System.out.println("Ajout d'une étoile");
    }
}

