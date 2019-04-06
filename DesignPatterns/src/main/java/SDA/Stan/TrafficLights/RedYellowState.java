package SDA.Stan.TrafficLights;

public class RedYellowState implements StateMachine {
    @Override
    public void nextState(TrafficLights tl) {
        tl.setState(new GreenState());
    }


}
