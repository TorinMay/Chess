import java.util.Graphics;

public class GameRunner {
	private Graphics g = new Graphics();
	private Board board = new Board();
	public static void main(String[] args) {
		board.paint(g);
	}
}