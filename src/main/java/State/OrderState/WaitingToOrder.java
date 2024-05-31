package State.OrderState;

import State.interfaces.OrderState;
import State.entities.Order;

public class WaitingToOrder implements OrderState {
    @Override
    public void advanceToNextWindow(Order order) {
        order.setState(new OrderCheck());
        System.out.println("Commande prise en compte.");
    }

    @Override
    public void makePayment(Order order) {
        System.out.println("[Error] - Impossible d'effectuer le paiement : la commande n'est pas encore prise en compte.");
    }

    @Override
    public void prepareOrder(Order order) {
        System.out.println("[Error] - Impossible de préparer la commande : la commande n'est pas encore prise en compte.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("[Error] - Impossible de livrer la commande : la commande n'est pas encore prise en compte.");
    }

    @Override
    public void finishOrder(Order order) {
        System.out.println("[Error] - Impossible de terminer la commande : la commande n'est pas encore prise en compte.");
    }
}

