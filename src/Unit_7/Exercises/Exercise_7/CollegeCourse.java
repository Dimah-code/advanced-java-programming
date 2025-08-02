package Unit_7.Exercises.Exercise_7;

public class CollegeCourse {
    private String courseNumber;
    private double baseCost; // cost of the course

    public CollegeCourse(String courseNumber, double baseCost) {
        this.courseNumber = courseNumber;
        this.baseCost = baseCost;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double calculateTotalCost() {
        return baseCost;
    }

    @Override
    public String toString() {
        return "CollegeCourse{courseNumber='" + courseNumber + "', baseCost=" + baseCost + "}";
    }
}
