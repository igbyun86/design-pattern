package behavior.command.example2.problem;

public class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void pressed() {
        theLamp.turnOn();
    }
}
