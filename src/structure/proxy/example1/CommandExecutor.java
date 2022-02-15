package structure.proxy.example1;

/**
 * command실행을 위한 interface
 * @author big
 *
 */
public interface CommandExecutor {

	public void runCommand(String cmd) throws Exception;
}
