package SDA.Stan.TrafficLights;

public class TrafficLights {
    private StateMachine state;

    TrafficLights(StateMachine state){
        this.state = state;
    }
    public void next(){
        state.nextState(this);
    }

    public StateMachine getState(){

        System.out.println(state.getClass().getSimpleName());
        return this.state;
    }

    public void setState(StateMachine state){
        this.state = state;
    }

}
