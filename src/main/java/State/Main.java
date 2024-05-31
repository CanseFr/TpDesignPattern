package State;

import State.art.Asci;
import State.entities.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 3 : State. \n");

        Order commande = new Order();

        commande.advanceToNextWindow();
        commande.makePayment();

        System.out.println("\n---Test 1 : Tentative de retourner au guichet");
        commande.advanceToNextWindow();
        System.out.println("\n");

        commande.prepareOrder();
        commande.deliverOrder();

        System.out.println("\n----Test 2 : Tentative de paiement");
        commande.makePayment();
        System.out.println("\n");


        System.out.println("\n---Test 3 : Tentative de retourner au guichet");
        commande.advanceToNextWindow();
        System.out.println("\n");

        commande.finishOrder();

        Asci.asci();

        System.out.println(" ----------------------------------------------------------------------------------------------------");
        System.out.println("| On doit constater dans le terminal des alertes a chaque changement d'etat illogique de la commande |");
        System.out.println(" ----------------------------------------------------------------------------------------------------");
    }
}