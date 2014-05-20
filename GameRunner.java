import java.awt.Graphics;

public class GameRunner {
	static Graphics g;
	public static final int cellWidth = 120;
	public static final int cellHeight = 120;
	public static final int numCellsX = 8;
	public static final int numCellsY = 8;
	private static Grid grid= new Grid();
	public static void main(String[] args) {
		grid.paint(g);
		Grid g  = this;
		Point p = new Point(numCellsX/2,0);
		King king = new King(p,"White",grid);
		grid.set(p,king);
		readImgs();
		JFrame frame = new JFrame("Chess");
		Grid grid = new Grid();
		frame.add(grid);
		frame.setSize((cellWidth * numCellsX) + 5,(cellHeight * numCellsY) + 35);
		frame.setVisible(true);

	}
}