package behavior.command.example1;

/**
 * Factory pattern을 이용한 util class
 * @author big
 *
 */
public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is : " + osName);
		
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		}
		else {
			return new UnixFileSystemReceiver();
		}
	}
}
