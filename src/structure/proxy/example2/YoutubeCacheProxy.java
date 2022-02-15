package structure.proxy.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * cache를 생성하여 전처리 작업을 하는 proxy 객체
 * @author big
 *
 */
public class YoutubeCacheProxy implements ThirdPartyYoutube {

	private ThirdPartyYoutube youtubeService;
	private Map<String, Video> cachePopular = new HashMap<String, Video>();
	private Map<String, Video> cacheAll = new HashMap<String, Video>();
	
	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYoutubeImpl();
	}
	
	/**
	 * cache에 data가 있으면 cache에 있는 popularVideos를 리턴하고
	 * 없으면 생성한다.
	 */
	@Override
	public Map<String, Video> popularVideos() {

		if (cachePopular.isEmpty()) {
			cachePopular = youtubeService.popularVideos();
		}
		else {
			System.out.println("Retrieved popular video from cache.");
		}
		
		return cachePopular;
	}

	/**
	 * cache에 data가 있으면 cache에 있는 video를 리턴하고
	 * 없으면 생성한다.
	 */
	@Override
	public Video getVideo(String videoId) {
		Video video = cacheAll.get(videoId);
		if (video == null) {
			video = youtubeService.getVideo(videoId);
			cacheAll.put(videoId, video);
		}
		else {
			System.out.println("Retrieved " + video.getTitle() + " video from cache.");
		}
		
		return video;
	}
	
	/**
	 * cache 초기화
	 */
	public void reset() {
		cachePopular.clear();
		cacheAll.clear();
	}

}
