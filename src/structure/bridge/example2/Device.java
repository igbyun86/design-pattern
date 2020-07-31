package structure.bridge.example2;

/**
 * Common interface of all device
 * @author big
 *
 */
public interface Device {

	boolean isEnabled();
	
	void enable();
	
	void disable();
	
	int getVolume();
	
	void setVolume(int volume);
	
	int getChannel();
	
	void setChannel(int channel);
	
	void printStatus();
	
}
