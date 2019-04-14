package SDA.Mediator.AmbulanceDispatcher;

public class Ambulance implements AmbulanceInterface {
    private AmbulanceState state;
    public Ambulance(){
        state = new Idle();
    }

    public AmbulanceState getState() {
        return state;
    }

    @Override
    public void acceptCall(String msg) {
        System.out.println("getting in action "+msg);
        state = new inAction();
    }

    @Override
    public void finished() {
        System.out.println(" we arer done, and waiting for new assignment");
        setState(new Idle());
    }

    public void setState(AmbulanceState state) {
        this.state = state;
    }
}
