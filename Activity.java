public class Activity {
    protected String type;
    protected int duration; 
    protected double caloriesBurned;

    public Activity(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = calculateCaloriesBurned();
    }

    public double calculateCaloriesBurned() {
        return duration * 10; 
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
