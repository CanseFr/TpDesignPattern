package Decorator.entities;

import Decorator.interfaces.ElementTree;

public class Tree implements ElementTree {
    @Override
    public void display() {
        System.out.println("Sapin de Noël");
    }

    @Override
    public int countElements() {
        return 0;
    }
}

