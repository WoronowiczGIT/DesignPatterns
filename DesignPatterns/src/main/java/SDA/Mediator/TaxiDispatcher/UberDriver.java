package SDA.Mediator.TaxiDispatcher;

public class UberDriver extends Driver {
    private String name;
    private Boolean available;

    public UberDriver(String name) {
        this.name = name;
        this.available = false;
    }
    @Override
    void onNewOrder(String orderName) {
        System.out.println(this.getClass().getSimpleName()+" got "+ orderName);
    }

    @Override
    Boolean isAvailable() {
        return this.available;
    }
    public void setAvailable(Boolean available){
        this.available = available;
    }
}
