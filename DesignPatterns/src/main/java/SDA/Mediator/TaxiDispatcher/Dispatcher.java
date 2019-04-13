package SDA.Mediator.TaxiDispatcher;

public interface Dispatcher {
    void newOrder(String order);
    void addDriver(Driver driver);
    void dispatchTaxi(String order);
    void addToQueue(Driver driver);
}
