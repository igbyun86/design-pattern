package behavior.strategy.example2.problem;

public abstract class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();
    public abstract void move();
}
