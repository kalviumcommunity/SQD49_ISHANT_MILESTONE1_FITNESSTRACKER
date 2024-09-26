public class FitnessTrackerApp {
    public static void main(String[] args) {
        
        User[] users = new User[3];

        users[0] = new User("Alice", 25, 65.0);
        users[1] = new User("Bob", 30, 75.0);
        users[2] = new User("Charlie", 28, 80.0);

        Activity running = new RunningActivity(30); 
        Activity cycling = new CyclingActivity(45); 

        for (User user : users) {
            user.logWorkout(running);   
            user.logWorkout(cycling);   
            user.generateProgressReport(); 
        }

        Activity weightlifting = new WeightliftingActivity(60); 
        users[0].logWorkout(weightlifting); 

        for (User user : users) {
            user.generateProgressReport();
        }
    }
}
