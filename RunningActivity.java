public class RunningActivity extends Activity {
    public RunningActivity(int duration) {
        super("Running", duration); 
    }

    @Override
    public double calculateCaloriesBurned() {
        return duration * 12; 
    }
}
