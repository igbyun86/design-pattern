package structure.adapter.example1;

public class MP4Player implements VideoMediaPlayer {

	@Override
	public void playAudio(String fileName) {
		System.out.println(fileName + ".mp4 music playing!!");
	}

	@Override
	public void playVideo(String fileName) {
		System.out.println(fileName + ".mp4 video playing!!");
	}

	@Override
	public void displaySubtitle() {
		System.out.println("mp4 subtitle...");
	}

}
