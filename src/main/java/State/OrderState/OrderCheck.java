package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class OrderCheck implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        System.out.println("[Error] - La commande est déjà prise en compte. Allez au paiement.");
    }

    @Override
    public void makePayment(Order order) {
        order.setState(new OderPayed());
        System.out.println("Commande payée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("[Error] - Impossible de préparer la commande : le paiement n'est pas encore effectué.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("[Error] - Impossible de livrer la commande : le paiement n'est pas encore effectué.");
    }

    @Override
    public void finishOrder(Order order) {
        System.out.println("[Error] - Impossible de terminer la commande : le paiement n'est pas encore effectué.");
    }
}

