package structure.proxy.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * youtube �ٿ�ε��� ����
 * @author big
 *
 */
public class ThirdPartyYoutubeImpl implements ThirdPartyYoutube {

	@Override
	public Map<String, Video> popularVideos() {
		Map<String, Video> videoMap = new HashMap<String, Video>();
		videoMap.put("11", new Video("aaa", "���ѵ��� ����.avi"));
		videoMap.put("55", new Video("eee", "��� ����.mp4"));
		videoMap.put("66", new Video("fff", "�����.mkv"));
		
		return videoMap;
	}

	@Override
	public Video getVideo(String videoId) {
		return new Video(videoId, videoId + " youtube title");
	}

}
