package structure.adapter.example1;

/**
 * video file format interface
 * @author big
 *
 */
public interface VideoMediaPlayer {

	public void playAudio(String fileName);
	
	public void playVideo(String fileName);
	
	public void displaySubtitle();
}
