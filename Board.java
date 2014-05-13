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
		frame.setSize((cellWidth * numCellsX) + 10,(cellHeight * numCellsY) + 40);
		frame.setVisible(true);

	}
	

	public void paint(Graphics g) {
		Color c = Color.black;
		for (int i=0; i < numCellsX; i++) {
			boolean isEven = ((i%2) == 0);
			if(isEven) {
				c = Color.white;
			}else {
				c = Color.black;
			}
			for (int j=0; j < numCellsY; j++) {
				int x = i * cellWidth;
				int y = j * cellHeight;
				if (c == Color.black) {
					c = Color.white;
				}else {
					c = Color.black;
				}
				g.setColor(c);
				g.fillRect(x,y,cellWidth,cellHeight);
				Point z = new Point(i,j);
				Piece piece = grid.getSquare(z).get();
				if (piece != null) {
				g.drawImage(kingImage, x, y, cellWidth, cellHeight, null);
				}
			}

		}
		
	}

	public static void readImgs() {
		try {
    		kingImage = ImageIO.read(new File("C:/Users/apcs/projects/Chess/img/king_white.png"));
		} catch (IOException e) {
			System.out.println("Error reading file" + e.getMessage());
		}
	}
}