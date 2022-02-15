package structure.proxy.example2;

import java.util.Map;

/**
 * youtube 다운로드기능이 있는 library interface
 * @author big
 *
 */
public interface ThirdPartyYoutube {

	Map<String, Video> popularVideos();
	
	Video getVideo(String videoId);
}
