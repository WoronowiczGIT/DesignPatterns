package SDA.Stan.TrafficLights;

public class GreenState implements StateMachine {
    @Override
    public void nextState(TrafficLights tl) {
        tl.setState(new YellowState());
    }


}
