package SDA.Mediator.TaxiDispatcher;

public abstract class Driver {

    abstract void onNewOrder(String orderName);
    abstract Boolean isAvailable();
}
