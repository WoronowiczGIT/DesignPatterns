package SDA.Mediator.AmbulanceDispatcher;

public interface AmbulanceInterface {
    AmbulanceState getState();
    void acceptCall(String msg);
    void finished();

}
