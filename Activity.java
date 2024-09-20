public class Activity {
    protected String type;
    protected int duration; 

    public Activity(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public double calculateCaloriesBurned() {
        return duration * 10; // Default calculation; subclasses can override
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return calculateCaloriesBurned(); // Call to calculate method
    }
}
