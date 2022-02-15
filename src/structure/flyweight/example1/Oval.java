package structure.flyweight.example1;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {

	private boolean isFill;
	
	public Oval(boolean isFill) {
		this.isFill = isFill;
		System.out.println("Creating Oval with fill = " + isFill);
		
		// 딜레이 시간 추가
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
		circle.setColor(color);
		circle.drawOval(x, y, width, height);
		
		if (isFill) {
			circle.fillOval(x, y, width, height);
		}
	}

}
