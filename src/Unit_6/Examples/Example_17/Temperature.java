package Unit_6.Examples.Example_17;

public class Temperature {
    private int daysInMonth;
    private int[] maxTemp;
    private int[] minTemp;

    public Temperature(){
        daysInMonth = 0;
        maxTemp = new int[31];
        minTemp = new int[31];
    }
    public Temperature(int[] maxTemp, int[] minTemp, int daysInMonth){
        this.daysInMonth = daysInMonth;
        this.maxTemp = new int[daysInMonth];
        this.minTemp = new int[daysInMonth];
        setTemp(maxTemp, minTemp, daysInMonth);
    }
    public void setTemp(int[] maxTemp, int[] minTemp, int daysInMonth){
        if(daysInMonth <= 31 && daysInMonth > 0){
            this.daysInMonth = daysInMonth;
            for(int i = 0; i < daysInMonth; i++){
                this.maxTemp[i] = maxTemp[i];
                this.minTemp[i] = minTemp[i];
            }
        }else{
            System.out.println("Number of days in month is out of range!!");
            this.daysInMonth = 0;
        }
    }
    public int monthMaxTempDay(){
        int day = 0;
        for (int i = 1; i < daysInMonth; i++) {
            if(maxTemp[day] < maxTemp[i]){
                day = i;
            }
        }
        return day;
    }
    public int monthMinTempDay(){
        int day = 0;
        for (int i = 1; i < daysInMonth; i++) {
            if(minTemp[day] > minTemp[i]){
                day = i;
            }
        }
        return day;
    }
    public int averageMaxTemp(){
        int sum = 0;
        for (int i = 0; i < daysInMonth; i++) {
            sum += maxTemp[i];
        }
        if(daysInMonth != 0){
            return sum / daysInMonth;
        }else{
            return -1;
        }
    }
    public int averageMinTemp(){
        int sum = 0;
        for (int i = 0; i < daysInMonth; i++) {
            sum += minTemp[i];
        }
        if(daysInMonth != 0){
            return sum / daysInMonth;
        }else{
            return -1;
        }
    }
    @Override
    public String toString(){
        String str;
        str = "Maximum temperature: " +
                maxTemp[monthMaxTempDay()] + "\n" +
                "Minimum temperature: " +
                minTemp[monthMinTempDay()] + "\n" +
                "Average maximum temperature: " +
                averageMaxTemp() + "\n" +
                "Average minimum temperature: " +
                averageMinTemp() + "\n";
        return str;
    }
}
