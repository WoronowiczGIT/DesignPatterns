package SDA.Mediator.AmbulanceDispatcher;

public class Idle implements AmbulanceState {
    @Override
    public void getState() {
        System.out.println("I am idle");
    }
}
