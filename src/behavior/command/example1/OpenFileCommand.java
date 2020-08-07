package behavior.command.example1;

/**
 * Concrete command class
 * @author big
 *
 */
public class OpenFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		fileSystem.openFile();
	}

}
