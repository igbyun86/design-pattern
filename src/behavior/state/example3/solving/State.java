package behavior.state.example3.solving;

public interface State {
    void on_button_pushed(Light light);
    void off_button_pushted(Light light);
}
