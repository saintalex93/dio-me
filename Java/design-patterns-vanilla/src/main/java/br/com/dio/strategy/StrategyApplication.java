package br.com.dio.strategy;

public class StrategyApplication {
    private static final Behavior NORMAL_BEHAVIOR = new NormalBehavior();
    private static final Behavior DEFENSIVE_BEHAVIOR = new DefensiveBehavior();
    private static final Behavior AGGRESSIVE_BEHAVIOR = new AggressiveBehavior();
    private static final Robot ROBOT = new Robot();

    public static void main(String[] args) {

        ROBOT.setBehavior(NORMAL_BEHAVIOR);
        ROBOT.move();
        ROBOT.setBehavior(DEFENSIVE_BEHAVIOR);
        ROBOT.move();
        ROBOT.setBehavior(AGGRESSIVE_BEHAVIOR);
        ROBOT.move();
    }
}
