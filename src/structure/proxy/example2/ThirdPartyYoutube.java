package structure.proxy.example2;

import java.util.Map;

/**
 * youtube �ٿ�ε����� �ִ� library interface
 * @author big
 *
 */
public interface ThirdPartyYoutube {

	Map<String, Video> popularVideos();
	
	Video getVideo(String videoId);
}
