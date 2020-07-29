package structure.proxy.example1;

import java.io.IOException;

/**
 * command실행을 위한 interface 구현 class
 * @author big
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
		
	}

}
