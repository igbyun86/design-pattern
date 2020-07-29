package structure.proxy.example1;

/**
 * CommandExecutorImpl 객체를 proxy하는 class
 * 같은 interface를 상속받아 구현한다.
 * 권한에 따라 처리하도록 추가
 * @author big
 *
 */
public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd) {
		if ("big".equals(user) && "1234".equals(pwd)) {
			isAdmin = true;
		}
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {

		if (isAdmin) {
			executor.runCommand(cmd);
		}
		else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm 명령어는 관리자만 실행할 수 있습니다.");
			}
			else {
				executor.runCommand(cmd);	
			}
		}
	}

}
