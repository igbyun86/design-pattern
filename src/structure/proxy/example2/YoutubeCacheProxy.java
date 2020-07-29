package structure.proxy.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * cache�� �����Ͽ� ��ó�� �۾��� �ϴ� proxy ��ü
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
	 * cache�� data�� ������ cache�� �ִ� popularVideos�� �����ϰ�
	 * ������ �����Ѵ�.
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
	 * cache�� data�� ������ cache�� �ִ� video�� �����ϰ�
	 * ������ �����Ѵ�.
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
	 * cache �ʱ�ȭ
	 */
	public void reset() {
		cachePopular.clear();
		cacheAll.clear();
	}

}
