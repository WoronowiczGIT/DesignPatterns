package SDA.Mediator.TaxiDispatcher;

import java.util.*;

public class TaxiDispatcher implements Dispatcher {
    private List<Driver> allDrivers;
    private Deque<Driver> queue;

    public TaxiDispatcher() {
        allDrivers = new ArrayList<>();
        queue = new ArrayDeque<>();
    }

    @Override
    public void newOrder(String order) {
        for (Driver d : allDrivers) {
            d.onNewOrder(order);
        }
    }

    @Override
    public void addDriver(Driver driver) {
        allDrivers.add(driver);
    }

    @Override
    public void dispatchTaxi(String order) {
        int iterator = 0;
        while (queue.size() > iterator) {
            if (queue.peek().isAvailable()) {
                queue.poll().onNewOrder(order);
                return;
            } else addToQueue(queue.poll());
            iterator++;
        }
        System.out.println("Brak taxowek");
    }

    @Override
    public void addToQueue(Driver driver) {
        queue.add(driver);
    }
}
