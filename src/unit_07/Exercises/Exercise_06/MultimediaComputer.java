package unit_07.Exercises.Exercise_06;

public class MultimediaComputer extends Computer {
    private double cdRomSpeed; // e.g., in RPM or some unit

    public MultimediaComputer(String processorType, double speed, double cdRomSpeed) {
        super(processorType, speed);
        this.cdRomSpeed = cdRomSpeed;
    }

    public double getCdRomSpeed() {
        return cdRomSpeed;
    }

    @Override
    public String toString() {
        return "MultimediaComputer{processorType='" + getProcessorType() + "', speed=" + getSpeed()
                + ", cdRomSpeed=" + cdRomSpeed + "}";
    }
}
