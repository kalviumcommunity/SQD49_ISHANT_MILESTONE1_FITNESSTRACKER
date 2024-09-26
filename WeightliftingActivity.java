public class WeightliftingActivity extends Activity {
    public WeightliftingActivity(int duration) {
        super("Weightlifting", duration); 
    }

    @Override
    public double calculateCaloriesBurned() {
        return duration * 5; 
    }
}
