package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class OrderFinalize implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        System.out.println("[Error] - La commande est déjà terminée.");
    }

    @Override
    public void makePayment(Order order) {
        System.out.println("[Error] - La commande est déjà terminée.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("[Error] - La commande est déjà terminée.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("[Error] - La commande est déjà terminée.");
    }

    @Override
    public void finishOrder(Order order) {
        System.out.println("[Error] - La commande est déjà terminée.");
    }
}

