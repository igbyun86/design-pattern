package behavior.command.example1;

public class FileInvoker {

	public Command command;
	
	public FileInvoker(Command c) {
		this.command = c;
	}
	
	public void execute() {
		command.execute();
	}
}
