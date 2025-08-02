package Unit_7.Exercises.Exercise_7;

public class LabCourse extends CollegeCourse {
    private double labFee;

    public LabCourse(String courseNumber, double baseCost, double labFee) {
        super(courseNumber, baseCost);
        this.labFee = labFee;
    }

    public double getLabFee() {
        return labFee;
    }

    @Override
    public double calculateTotalCost() {
        return getBaseCost() + labFee;
    }

    @Override
    public String toString() {
        return "LabCourse{courseNumber='" + getCourseNumber() + "', baseCost=" + getBaseCost()
                + ", labFee=" + labFee + "}";
    }
}
