import java.awt.Graphics;

public class GameRunner {
	static Graphics g;
	private static Grid grid= new Grid();
	public static void main(String[] args) {
		grid.paint(g);
	}
}