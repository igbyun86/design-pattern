package behavior.command;

import org.junit.Test;

import behavior.command.example1.CloseFileCommand;
import behavior.command.example1.Command;
import behavior.command.example1.FileInvoker;
import behavior.command.example1.FileSystemReceiver;
import behavior.command.example1.FileSystemReceiverUtil;
import behavior.command.example1.OpenFileCommand;
import behavior.command.example1.WriteFileCommand;

public class CommandTest {

	@Test
	public void fileSystemTest() {
		// 현재 OS에 맞는 receiver object 생성
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		// open file command object 생성
		Command command = new OpenFileCommand(fs);
		
		// command 실행
		FileInvoker file = new FileInvoker(command);
		file.execute();
		
		// write file
		command = new WriteFileCommand(fs);
		file = new FileInvoker(command);
		file.execute();
		
		// close file
		command = new CloseFileCommand(fs);
		file = new FileInvoker(command);
		file.execute();
		
		fs.openFile();
		fs.writeFile();
		fs.closeFile();
		
		/*
			Underlying OS is : Windows 10
			Opening file in Windows OS
			Writing file in Windows OS
			Closing file in Windows OS
		*/
	}
}
