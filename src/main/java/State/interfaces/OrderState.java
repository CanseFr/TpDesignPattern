package State.interfaces;

import State.entities.Order;

public interface OrderState {
    void advanceToNextWindow(Order order);
    void makePayment(Order order);
    void prepareOrder(Order order);
    void deliverOrder(Order order);
    void finishOrder(Order order);
}

