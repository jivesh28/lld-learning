package LLDPatterns.Strategy;

public  class NormalDriveStrategy implements DriveStrategyInterface{
    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}