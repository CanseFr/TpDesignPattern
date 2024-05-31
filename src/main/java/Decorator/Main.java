package Decorator;

import Decorator.decorators.Ball;
import Decorator.decorators.Star;
import Decorator.decorators.Garland;
import Decorator.decorators.LittleAngel;
import Decorator.entities.Tree;
import Decorator.interfaces.ElementTree;
import Decorator.art.Asci;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 4 : Decorator. \n");

        ElementTree sapin = new Tree();
        System.out.println("\n");

        sapin = new Garland(sapin);
        sapin = new Ball(sapin);
        sapin = new Ball(sapin);
        sapin = new Star(sapin);
        sapin = new LittleAngel(sapin);

        sapin.display();

        System.out.println("\n");
        Asci.asci();
        System.out.println("\n");


        System.out.println(" -----------------------------------------");
        System.out.println("| Nombre total d'éléments sur le sapin : " + sapin.countElements() + "|");
        System.out.println(" -----------------------------------------");

    }
}