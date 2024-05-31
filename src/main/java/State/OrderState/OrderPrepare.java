package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class OrderPrepare implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        System.out.println("[Error] - La commande est déjà préparée. Allez à la livraison.");
    }

    @Override
    public void makePayment(Order order) {
        System.out.println("[Error] - La commande est déjà payée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("[Error] - La commande est déjà préparée.");
    }

    @Override
    public void deliverOrder(Order order) {
        order.setState(new OrderDelivery());
        System.out.println("Commande livrée.");
    }

    @Override
    public void finishOrder(Order order) {
        System.out.println("[Error] - Impossible de terminer la commande : elle n'est pas encore livrée.");
    }
}

