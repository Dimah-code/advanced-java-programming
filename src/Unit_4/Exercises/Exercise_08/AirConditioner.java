package Unit_4.Exercises.Exercise_08;

public class AirConditioner {
    private boolean isOn;
    private int temperature;
    private int fanSpeed;

    public AirConditioner(){
        this.isOn = false;
        this.temperature = 0;
        this.fanSpeed = 0;
    }
    public void turnOn(){
        this.isOn = true;
        System.out.println("The air conditioner was turned on.");
        setTemperature(20);
        setFanSpeed(1);
    }
    public void turnOff(){
        this.isOn = false;
        System.out.println("The air conditioner was turned off.");
        this.temperature = 0;
        setFanSpeed(0);
    }
    public void setTemperature(int temperature){
        if(temperature >= 16 && temperature <= 60){
            this.temperature = temperature;
            System.out.println("Temperature set on " + this.temperature);
        }else{
            System.out.println("Temperature should be between 16 and 60");
        }
    }
    public void setFanSpeed(int speed){
        if(speed >= 0 && speed <= 3){
            this.fanSpeed = speed;
            System.out.println("Speed: " + speed);
        }
        this.fanSpeed = 1;
    }
    @Override
    public String  toString(){
        return "status: " + (isOn ? "ON" : "OFF") + "\nTemperature: " + temperature +
                "\nSpeed: " + fanSpeed;
    }
}
