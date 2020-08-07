package behavior.command.example1;

/**
 * Concrete command class
 * @author big
 *
 */
public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		fileSystem.closeFile();
	}
}
