package unit_07.Exercises.Exercise_06;

public class Computer {
    private String processorType;
    private double speed; // in GHz or any unit

    public Computer(String processorType, double speed) {
        this.processorType = processorType;
        this.speed = speed;
    }

    public String getProcessorType() {
        return processorType;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Computer{processorType='" + processorType + "', speed=" + speed + "}";
    }
}
