package Decorator.decorators;

import Decorator.interfaces.ElementTree;

public class LittleAngel extends ElementDecorator {
    public LittleAngel(ElementTree tree) {
        super(tree);
    }

    @Override
    public void display() {
        tree.display();
        System.out.println("Ajout d'un petit ange");
    }
}

