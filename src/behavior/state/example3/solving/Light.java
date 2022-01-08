package behavior.state.example3.solving;

public class Light {
    private State state;

    public Light() {
        this.state = OFF.getInstance();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.off_button_pushted(this);
    }
}
