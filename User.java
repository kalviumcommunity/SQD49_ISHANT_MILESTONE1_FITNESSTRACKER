public class User {
    private String name;
    private int age;
    private double weight; 
    private double fitnessLevel; 
    private double totalCaloriesBurned;
    private String fitnessGoal;

    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.fitnessLevel = 50; 
        this.totalCaloriesBurned = 0; 
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
        System.out.println("Goal set: " + goal);
    }

    public void generateProgressReport() {
        System.out.println("===== Progress Report =====");
        System.out.println("Name: " + name);
        System.out.println("Total calories burned: " + totalCaloriesBurned);
        System.out.println("Current fitness level: " + fitnessLevel);
        System.out.println("Fitness goal: " + (fitnessGoal != null ? fitnessGoal : "No goal set"));
        System.out.println("===========================");
    }

    public String getName() {
        return name;
    }

    public double getFitnessLevel() {
        return fitnessLevel;
    }

    public double getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }
}
