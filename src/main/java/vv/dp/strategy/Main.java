package vv.dp.strategy;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym(new Walk());
        gym.execute();

        // changing the strategy at runtime.
        gym.setWorkoutStrategy(new Run());
        gym.execute();

        gym.setWorkoutStrategy(new Jump());
        gym.execute();
    }
}
