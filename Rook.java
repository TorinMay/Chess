import java.util.ArrayList;

public class Rook extends Piece{
	
	public Rook(Point p, String color,Grid grid) {
		super("Rook", color, p, grid);
	}

	public ArrayList<Point> getMoves()
	{
		ArrayList<Point> possibleMoves = new ArrayList<Point>();
		int y = getLoc().getY();
		int x = getLoc().getX();
		

		return possibleMoves;
	}


	public boolean isMoveLegal(Point k) {
		if(k.getY() == getLoc().getY()) {
			return true;
		}else if(k.getX() == getLoc().getX()) {
			return true;
		}
		return false;
	}
}