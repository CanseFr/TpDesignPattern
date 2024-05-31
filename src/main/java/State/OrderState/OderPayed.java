package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class OderPayed implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        System.out.println("[Error] - La commande est déjà payée. Allez à la préparation.");
    }

    @Override
    public void makePayment(Order order) {
        System.out.println("[Error] - La commande est déjà payée.");
    }

    @Override
    public void prepareOrder(Order order) {
        order.setState(new OrderPrepare());
        System.out.println("Commande préparée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("[Error] - Impossible de livrer la commande : elle n'est pas encore préparée.");
    }

    @Override
    public void finishOrder(Order order) {
        System.out.println("[Error] - Impossible de terminer la commande : elle n'est pas encore livrée.");
    }
}

