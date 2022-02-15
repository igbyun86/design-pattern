package structure.flyweight.example1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import structure.flyweight.example1.ShapeFactory.ShapeType;

/**
 * Flyweight 패턴은 객체의 고유속성을 가져가면서 외부속성만 변경하여
 * 객체를 사용하는 경우 객체를 공유하여 사용할 수 있다.
 * 예제에서 바뀌지 않는 속성은 선, 타원의 모양이고
 * 길이나 생상은 client에서 변경하여 객체를 공유해서 사용한다. 
 * @author big
 *
 */
public class DrawingTest extends JFrame {

	private static final long serialVersionUID = 231511487591785956L;
	private final int WIDTH;
	private final int HEIGHT;
	
	private static final ShapeType[] shapes = {ShapeType.LINE, ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL};
	private static final Color[] colors = {Color.BLUE, Color.RED, Color.YELLOW, Color.MAGENTA, Color.CYAN, Color.ORANGE};
	
	public DrawingTest(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		Container contentPane = getContentPane();
		
		JButton startButton = new JButton("Draw");
		final JPanel panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(startButton, BorderLayout.SOUTH);
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		startButton.addActionListener(e -> {
			Graphics g = panel.getGraphics();
			for (int i = 0; i < 10; i++) {
				Shape shape = ShapeFactory.getShape(getRandomShape());
				shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
			}
		});
	}
	
	private ShapeType getRandomShape() {
		return shapes[(int) (Math.random() * shapes.length)];
	}
	
	private int getRandomX() {
		return (int) (Math.random() * WIDTH);
	}

	private int getRandomY() {
		return (int) (Math.random() * HEIGHT);
	}

	private int getRandomWidth() {
		return (int) (Math.random() * (WIDTH / 10));
	}

	private int getRandomHeight() {
		return (int) (Math.random() * (HEIGHT / 10));
	}

	private Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
	
	public static void main(String[] args) {
		DrawingTest drwaing = new DrawingTest(500, 600);
	}

}
