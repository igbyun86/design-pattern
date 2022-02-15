package structure.proxy.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * youtube 다운로드기능 구현
 * @author big
 *
 */
public class ThirdPartyYoutubeImpl implements ThirdPartyYoutube {

	@Override
	public Map<String, Video> popularVideos() {
		Map<String, Video> videoMap = new HashMap<String, Video>();
		videoMap.put("11", new Video("aaa", "무한도전 모음.avi"));
		videoMap.put("55", new Video("eee", "어린이 동요.mp4"));
		videoMap.put("66", new Video("fff", "어벤저스.mkv"));
		
		return videoMap;
	}

	@Override
	public Video getVideo(String videoId) {
		return new Video(videoId, videoId + " youtube title");
	}

}
