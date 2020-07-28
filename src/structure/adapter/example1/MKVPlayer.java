package structure.adapter.example1;

public class MKVPlayer implements VideoMediaPlayer {

	@Override
	public void playAudio(String fileName) {
		System.out.println(fileName + ".mkv music playing!!");
	}

	@Override
	public void playVideo(String fileName) {
		System.out.println(fileName + ".mkv video playing!!");
	}

	@Override
	public void displaySubtitle() {
		System.out.println("mkv subtitle...");
	}

}
