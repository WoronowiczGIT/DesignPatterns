package SDA.Mediator;

import SDA.Mediator.AmbulanceDispatcher.Ambulance;
import SDA.Mediator.AmbulanceDispatcher.AmbulanceDispatcher;
import SDA.Mediator.AmbulanceDispatcher.AmbulanceInterface;
import SDA.Mediator.AmbulanceDispatcher.DispatcherInterface;
import SDA.Mediator.TaxiDispatcher.Dispatcher;
import SDA.Mediator.TaxiDispatcher.TaxiDispatcher;
import SDA.Mediator.TaxiDispatcher.TaxiDriver;
import SDA.Mediator.TaxiDispatcher.UberDriver;

public class Main{
    public static void main(String[] args) {
        Dispatcher dyspozytor = new TaxiDispatcher();
        TaxiDriver taxi = new TaxiDriver("Janusz");
        UberDriver uber = new UberDriver("Brajanusz");

        dyspozytor.addDriver(taxi);
        dyspozytor.addDriver(uber);
       // dyspozytor.newOrder("taxi na jana pawla");

        dyspozytor.addToQueue(taxi);
        dyspozytor.addToQueue(uber);
        taxi.setAvailable(false);
        uber.setAvailable(true);

        dyspozytor.dispatchTaxi("poprosze taxi na Niebuszewo");

        DispatcherInterface dyspozytornia = new AmbulanceDispatcher();
        AmbulanceInterface karetka = new Ambulance();

        dyspozytornia.addAmbulance(karetka);
        dyspozytornia.getCall("weeooo weee oo");

    }

}
