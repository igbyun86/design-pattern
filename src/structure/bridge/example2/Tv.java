package structure.bridge.example2;

public class Tv implements Device {

	private boolean on;
	private int volume;
	private int channel;
	
	public Tv(boolean on, int volume, int channel) {
		this.on = on;
		this.volume = volume;
		this.channel = channel;
	}
	
	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		this.on = true;
	}
	
	@Override
	public void disable() {
		this.on = false;
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			volume = 100;
		}
		else if (volume < 0) {
			volume = 0;
		}
		else {
			this.volume = volume;
		}
	}

	@Override
	public int getChannel() {
		return channel;
	}

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume);
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
	}

}
