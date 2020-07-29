package structure.proxy.example2;

import java.util.Map;

/**
 * youtube ��ɿ� ���� �����ϴ� context ��ü
 * @author big
 *
 */
public class YoutubeDownloader {

	private ThirdPartyYoutube youtubeApi;
	
	public YoutubeDownloader(ThirdPartyYoutube api) {
		this.youtubeApi = api;
	}
	
	public void playVideo(String videoId) {
		Video video = youtubeApi.getVideo(videoId);
		System.out.println(video.getTitle() + " playing!");
	}
	
	public void playPopularVideo() {
		Map<String, Video> videoMap = youtubeApi.popularVideos();
		for (Video video : videoMap.values()) {
			System.out.println("popular " + video.getTitle() + " playing!");
		}
	}
	
}
