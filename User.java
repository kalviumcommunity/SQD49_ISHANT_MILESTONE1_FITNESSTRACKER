public class User {
    private String name;
    private int age;
    private double weight; 
    private double fitnessLevel; 
    private double totalCaloriesBurned;
    private String fitnessGoal;

    // Constructor
    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.fitnessLevel = 50; // Default fitness level
        this.totalCaloriesBurned = 0; // Initially no calories burned
    }

    public void logWorkout(Activity activity) {
        fitnessLevel += activity.getCaloriesBurned() / 100; 
        totalCaloriesBurned += activity.getCaloriesBurned(); 
        System.out.println("Workout logged: " + activity.getType() + " for " + activity.getDuration() + " minutes.");
        System.out.println("Calories burned: " + activity.getCaloriesBurned());
        System.out.println("Current fitness level: " + fitnessLevel);
    }

    public void setGoal(String goal) {
        this.fitnessGoal = goal;
        System.out.println("Goal set: " + this.fitnessGoal);
    }

    public void generateProgressReport() {
        System.out.println("===== Progress Report =====");
        System.out.println("Name: " + this.name);
        System.out.println("Total calories burned: " + this.totalCaloriesBurned);
        System.out.println("Current fitness level: " + this.fitnessLevel);
        System.out.println("Fitness goal: " + (this.fitnessGoal != null ? this.fitnessGoal : "No goal set"));
        System.out.println("===========================");
    }

    public String getName() {
        return this.name;
    }

    public double getFitnessLevel() {
        return this.fitnessLevel;
    }

    public double getTotalCaloriesBurned() {
        return this.totalCaloriesBurned;
    }
}
