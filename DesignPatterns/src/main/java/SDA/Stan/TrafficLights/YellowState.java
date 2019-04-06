package SDA.Stan.TrafficLights;

public class YellowState implements StateMachine {
    @Override
    public void nextState(TrafficLights tl) {
        tl.setState(new RedState());
    }


}
