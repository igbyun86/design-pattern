package structure.adapter.example1;

/**
 * ����� interface�� video ���� ���������� ������ adapter class
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
