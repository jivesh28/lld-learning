package LLDPatterns.Strategy;

public  class SportsDriveStrategy implements DriveStrategyInterface{
    @Override
    public void drive() {
        System.out.println("SportsDriveStrategy");
    }
}