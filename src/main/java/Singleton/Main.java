package Singleton;

import Singleton.entities.PromotionManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 1 : Singleton ");

        PromotionManager responsable = PromotionManager.getInstance();
        responsable.setName("Jean Jean");
        responsable.displayInfo();
        responsable.setName("Ouais Ouais");
        responsable.displayInfo();

//        Tentative de creation d'une nouvelle instance, un message d'erreur devrait s'afficher dans le terminal
        PromotionManager responsable1 = PromotionManager.getInstance();
        PromotionManager responsable2 = PromotionManager.getInstance();
    }
}