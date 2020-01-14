package vv.dp.strategy;

public class Gym {
    private WorkoutStrategy workoutStrategy;

    public Gym(WorkoutStrategy workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public void setWorkoutStrategy(WorkoutStrategy workoutStrategy) {
        this.workoutStrategy = workoutStrategy;
    }

    public void execute() {
        this.workoutStrategy.doWork();
    }
}
