package Decorator.decorators;

import Decorator.interfaces.ElementTree;

public abstract class ElementDecorator implements ElementTree {
    protected ElementTree tree;

    public ElementDecorator(ElementTree tree) {
        this.tree = tree;
    }

    @Override
    public void display() {
        tree.display();
    }

    @Override
    public int countElements() {
        return tree.countElements() + 1;
    }
}

