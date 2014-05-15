import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class Board extends JPanel{
	public static final int cellWidth = 120;
	public static final int cellHeight = 120;
	public static final int numCellsX = 8;
	public static final int numCellsY = 8;
	public static Grid grid = new Grid();
	static BufferedImage kingImage = null;
	
	public static void main(String[] args) {
		Point p = new Point(numCellsX/2,0);
		King king = new King(p,"White");
		grid.set(p,king);
		readImgs();
		JFrame frame = new JFrame("Chess");
		Board board = new Board();
		frame.add(board);
		frame.setSize((cellWidth * numCellsX) + 5,(cellHeight * numCellsY) + 35);
		frame.setVisible(true);

	}
	

	public void paint(Graphics g) {
		String a = "";
		Color b = new Color(94,38,18);
		Color c = new Color(94,38,18);
		for (int i=0; i < numCellsX; i++) {
			boolean isEven = ((i%2) == 0);
			if(isEven) {
				a = "White";
			}else {
				a = "Black";
			}
			for (int j=0; j < numCellsY; j++) {
				int x = i * cellWidth;
				int y = j * cellHeight;
				if (a.equals("Black")) {
					a = "White";
				}else {
					a = "Black";
				}
				Point z = new Point(i,j);
				Square square = new Square(a,z,null);
				square.paint(i,j,g);				
				Piece piece = grid.getSquare(z).get();
				if (piece != null) {
					g.drawImage(kingImage, x, y, cellWidth, cellHeight, null);
				}
			}

		}
		
	}

	public static void readImgs() {
		try {
    		kingImage = ImageIO.read(new File("/Users/apcs/projects/Chess/img/king_white.png"));
		} catch (IOException e) {
			System.out.println("Error reading file " + e.getMessage());
		}
	}
}