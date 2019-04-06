package SDA.Stan.TrafficLights;

public class Main {
    public static void main(String[] args) {
        TrafficLights tl = new TrafficLights(new RedState());

        int i =15;
        while(i >0){

            tl.next();
            tl.getState();
            i--;
        }


    }
}
