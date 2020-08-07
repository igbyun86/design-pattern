package behavior.command.example1;

/**
 * Concrete command class
 * @author big
 *
 */
public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		fileSystem.writeFile();
	}
}
