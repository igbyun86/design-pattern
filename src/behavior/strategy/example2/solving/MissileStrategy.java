package behavior.strategy.example2.solving;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missile and can attack with it.");
    }
}
