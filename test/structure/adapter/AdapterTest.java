package structure.adapter;

import org.junit.Test;

import structure.adapter.example1.AudioAdapter;
import structure.adapter.example1.AudioPlayer;
import structure.adapter.example1.MKVPlayer;
import structure.adapter.example1.MP3Player;
import structure.adapter.example1.MP4Player;
import structure.adapter.example1.WMAPlayer;

/**
 * 2개의 관련없는 interface가 함께 작동해야 하는 경우 사용한다.
 * @author big
 *
 */
public class AdapterTest {

	@Test
	public void mediaPlayerAdapterTest() {
		AudioPlayer mp3 = new MP3Player();
		AudioPlayer wma = new WMAPlayer();
		
		AudioPlayer mp4 = new AudioAdapter(new MP4Player());
		AudioPlayer mkv = new AudioAdapter(new MKVPlayer());
		
		mp3.play("여행을 떠나요");
		wma.play("Vivaldi – The Four Seasons");
		mp4.play("겨울왕국 OST");
		mkv.play("알라딘 OST");
	}
}
