package LLDPatterns.Strategy;

public class CommercialVehicle extends Vehicle{

    super(new NormalDriveStrategy() );
}