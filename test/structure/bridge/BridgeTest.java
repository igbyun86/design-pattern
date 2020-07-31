package structure.bridge;

import org.junit.Test;

import structure.bridge.example1.GreenColor;
import structure.bridge.example1.Pentagon;
import structure.bridge.example1.RedColor;
import structure.bridge.example1.Shape;
import structure.bridge.example1.Triangle;
import structure.bridge.example2.AdvancedRemote;
import structure.bridge.example2.BasicRemote;
import structure.bridge.example2.Device;
import structure.bridge.example2.Radio;
import structure.bridge.example2.Tv;


public class BridgeTest {

	
	@Test
	public void shapeColorTest() {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
		
	}
	
	@Test
	public void remoteDeviceTest() {
		Device device = new Tv(false, 10, 11);
		BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        device = new Radio(false, 15, 22);
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
	}
}
