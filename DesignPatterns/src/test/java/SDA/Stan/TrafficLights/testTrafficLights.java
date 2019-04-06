package SDA.Stan.TrafficLights;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class testTrafficLights {
    TrafficLights trafficLights;
    @Before
    public void setUp(){
        trafficLights = new TrafficLights(new RedYellowState());
    }

    @Test
    public void redState(){

        //given
        trafficLights.setState(new GreenState());
        //when
        trafficLights.next();
        //then
        Assert.assertTrue(trafficLights.getState() instanceof YellowState );
    }


}
