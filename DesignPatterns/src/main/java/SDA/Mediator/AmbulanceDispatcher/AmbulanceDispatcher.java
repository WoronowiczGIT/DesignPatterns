package SDA.Mediator.AmbulanceDispatcher;

import java.util.ArrayList;
import java.util.List;

public class AmbulanceDispatcher implements DispatcherInterface{
    private List<AmbulanceInterface> ambulances;

    public AmbulanceDispatcher(){
        this.ambulances = new ArrayList<>();
    }

    @Override
    public void getCall(String msg) {
        for (AmbulanceInterface ambulance: ambulances){
            if(ambulance.getState() instanceof Idle){
                ambulance.acceptCall(msg);
            }
        }
    }
    @Override
    public void addAmbulance(AmbulanceInterface ambulance) {
        ambulances.add(ambulance);
    }
}
