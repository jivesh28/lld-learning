package LLDPatterns.Strategy;

public class Vehicle {

    DriveStrategyInterface driveStrategyInterfaceObject ;

    Vehicle(DriveStrategyInterface driveObj)
    {
        this.driveStrategyInterfaceObject = driveObj;
    }
    public void drive()
    {
        driveStrategyInterfaceObject.drive();
    }
    public  void stop()
    {
        System.out.println("Vehicle stopped");
    }
}
