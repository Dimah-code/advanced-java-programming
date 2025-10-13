package Unit_4.Exercises.Exercise_08;

public class Exercise_4_8 {
    public static void main(String[] args) {
        AirConditioner device = new AirConditioner();
        System.out.println(device);
        device.turnOn();
        device.setFanSpeed(3);
        device.setTemperature(20);
        System.out.println(device);

        device.setFanSpeed(1);
        device.setTemperature(30);
        System.out.println(device);
        device.turnOff();
    }
}
