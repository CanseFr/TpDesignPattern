package State.entities;

import State.OrderState.WaitingToOrder;
import State.interfaces.OrderState;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new WaitingToOrder();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void advanceToNextWindow() {
        state.advanceToNextWindow(this);
    }

    public void makePayment() {
        state.makePayment(this);
    }

    public void prepareOrder() {
        state.prepareOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void finishOrder() {
        state.finishOrder(this);
    }
}

