package structure.adapter.example1;

/**
 * 오디오 interface에 video 파일 오디오기능을 적용한 adapter class
 * @author big
 *
 */
public class AudioAdapter implements AudioPlayer {

	private VideoMediaPlayer videoMediaPlayer;
	
	public AudioAdapter(VideoMediaPlayer video) {
		videoMediaPlayer = video;
	}
	
	@Override
	public void play(String fileName) {
		videoMediaPlayer.playAudio(fileName);
	}
}
