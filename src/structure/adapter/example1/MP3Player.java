package structure.adapter.example1;

public class MP3Player implements AudioPlayer {

	@Override
	public void play(String fileName) {
		System.out.println(fileName + ".mp3 music playing!!");
	}

}
