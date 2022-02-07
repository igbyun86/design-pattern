package behavior.command.example2.solving;

public class LampOffCommand implements Command {
    private Lamp theLamp;

    public LampOffCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    @Override
    public void execute() {
        this.theLamp.turnOff();
    }
}
