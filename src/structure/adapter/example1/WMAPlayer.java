package structure.adapter.example1;

public class WMAPlayer implements AudioPlayer {

	@Override
	public void play(String fileName) {
		System.out.println(fileName + ".wma music playing!!");
	}

}
