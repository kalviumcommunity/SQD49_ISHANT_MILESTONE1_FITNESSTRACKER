public class CyclingActivity extends Activity {
    public CyclingActivity(int duration) {
        super("Cycling", duration); 
    }

    @Override
    public double calculateCaloriesBurned() {
        return duration * 8; 
    }
}
