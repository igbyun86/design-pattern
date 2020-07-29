package structure.proxy.example1;

/**
 * CommandExecutorImpl ��ü�� proxy�ϴ� class
 * ���� interface�� ��ӹ޾� �����Ѵ�.
 * ���ѿ� ���� ó���ϵ��� �߰�
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
				throw new Exception("rm ��ɾ�� �����ڸ� ������ �� �ֽ��ϴ�.");
			}
			else {
				executor.runCommand(cmd);	
			}
		}
	}

}
