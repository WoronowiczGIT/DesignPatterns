package SDA.Mediator.AmbulanceDispatcher;

public interface DispatcherInterface {

    void getCall(String msg);

    void addAmbulance(AmbulanceInterface ambulance);
}
