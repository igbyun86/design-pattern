package behavior.state.example3.solving;

public class ON implements State {
    private static ON on = new ON();
    private ON() {}

    public static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void off_button_pushted(Light light) {
        System.out.println("Light Off!");
        light.setState(OFF.getInstance());
    }
}
