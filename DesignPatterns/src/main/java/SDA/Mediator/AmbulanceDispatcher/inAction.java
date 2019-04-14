package SDA.Mediator.AmbulanceDispatcher;

public class inAction  implements AmbulanceState{
    @Override
    public void getState() {
        System.out.println("I am in Action");
    }
}
