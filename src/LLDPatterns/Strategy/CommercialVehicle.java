package LLDPatterns.Strategy;

public class CommercialVehicle extends Vehicle{

    public CommercialVehicle() {
        super(new NormalDriveStrategy() );
    }
}