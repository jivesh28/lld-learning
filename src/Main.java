import LLDPatterns.Strategy.OffRoadVehicle;
import LLDPatterns.Strategy.Vehicle;

public class Main
{
    public static void main(String[] args){

        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}
