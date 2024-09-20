public class FitnessTrackerApp {
    public static void main(String[] args) {
        // Create an array to hold User objects
        User[] users = new User[3]; // Array for 3 users

        // Initialize the User objects
        users[0] = new User("Alice", 25, 65.0);
        users[1] = new User("Bob", 30, 75.0);
        users[2] = new User("Charlie", 28, 80.0);

        // Create Activity objects
        Activity running = new RunningActivity(30);
        Activity cycling = new CyclingActivity(45);
        Activity weightlifting = new WeightliftingActivity(60);

        // Log workouts and generate reports for each user
        for (User user : users) {
            user.logWorkout(running);
            user.logWorkout(cycling);
            user.logWorkout(weightlifting);
            user.generateProgressReport(); // Generate report for each user
        }
    }
}
