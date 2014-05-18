import java.awt.Graphics;

public class GameRunner {
	public static Graphics g = new Graphics();
	private static Grid grid= new Grid();
	public static void main(String[] args) {
		grid.paint(g);
	}
}