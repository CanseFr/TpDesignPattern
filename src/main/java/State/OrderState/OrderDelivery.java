package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class OrderDelivery implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        System.out.println("[Error] - La commande est déjà livrée. Terminez la commande.");
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
        System.out.println("[Error] - La commande est déjà livrée.");
    }

    @Override
    public void finishOrder(Order order) {
        order.setState(new OrderFinalize());
        System.out.println("Commande terminée.");
    }
}

