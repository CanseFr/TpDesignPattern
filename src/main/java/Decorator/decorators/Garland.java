package Decorator.decorators;

import Decorator.interfaces.ElementTree;

public class Garland extends ElementDecorator {
    public Garland(ElementTree tree) {
        super(tree);
    }

    @Override
    public void display() {
        tree.display();
        System.out.println("Ajout d'une guirlande");
    }
}

