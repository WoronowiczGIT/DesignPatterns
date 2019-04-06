package SDA.Stan.TrafficLights;

public class RedState implements StateMachine {

    @Override
    public void nextState(TrafficLights tl) {
        tl.setState(new RedYellowState());
    }


}
