package structure.proxy;

import org.junit.Test;

import structure.proxy.example1.CommandExecutor;
import structure.proxy.example1.CommandExecutorProxy;
import structure.proxy.example2.ThirdPartyYoutubeImpl;
import structure.proxy.example2.YoutubeCacheProxy;
import structure.proxy.example2.YoutubeDownloader;

public class ProxyTest {

	@Test
	public void commandExcutorTest() {
		CommandExecutor executorAdmin = new CommandExecutorProxy("big", "1234");
		CommandExecutor executorUser = new CommandExecutorProxy("test", "1234");
		
		try {
			executorAdmin.runCommand("ipconfig");
			executorUser.runCommand(" rm -rf aaa.txt");
		} catch (Exception e) {
			System.out.println("Exeception Message : " + e.getMessage());
		}
		
		
		/*
		 	Print 
			---------------------------------------------------
			'ipconfig' command executed.
			Exeception Message : rm ��ɾ�� �����ڸ� ������ �� �ֽ��ϴ�.
		 */
	}
	
	
	@Test
	public void youtubeDownloadTest() {
		YoutubeDownloader downloader = new YoutubeDownloader(new ThirdPartyYoutubeImpl());
		YoutubeDownloader cacheDownloader = new YoutubeDownloader(new YoutubeCacheProxy());
		
		
		downloader.playVideo("11111");
		downloader.playVideo("22222");
		downloader.playVideo("11111");
		
		cacheDownloader.playVideo("11111");
		cacheDownloader.playVideo("22222");
		cacheDownloader.playVideo("11111");
		
		downloader.playPopularVideo();
		downloader.playPopularVideo();
		
		cacheDownloader.playPopularVideo();
		cacheDownloader.playPopularVideo();
		
		
		/*
			Print
			---------------------------------------------------
			11111 youtube title playing!
			22222 youtube title playing!
			11111 youtube title playing!
			
			11111 youtube title playing!
			22222 youtube title playing!
			Retrieved 11111 youtube title video from cache.
			11111 youtube title playing!
			
			popular ���ѵ��� ����.avi playing!
			popular ��� ����.mp4 playing!
			popular �����.mkv playing!
			
			popular ���ѵ��� ����.avi playing!
			popular ��� ����.mp4 playing!
			popular �����.mkv playing!
			
			popular ���ѵ��� ����.avi playing!
			popular ��� ����.mp4 playing!
			popular �����.mkv playing!
			
			Retrieved popular video from cache.
			popular ���ѵ��� ����.avi playing!
			popular ��� ����.mp4 playing!
			popular �����.mkv playing!
	
		*/
	}
}
