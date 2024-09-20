public class FitnessTracker {
    public static void main(String[] args) {
        User user = new User("John", 25, 70);

        Activity running = new RunningActivity(30); 
        user.logWorkout(running);

        Activity cycling = new CyclingActivity(45); 
        user.logWorkout(cycling);

        Activity weightlifting = new WeightliftingActivity(60); 
        user.logWorkout(weightlifting);

        user.setGoal("Lose 5kg");

        user.generateProgressReport();
    }
}
