import java.util.ArrayList;

public class Pawn extends Piece{

	private int moveCount = 0;

	public Pawn(Point p, String color,Grid grid) {
		super("Pawn", color, p, grid);
	}

	public ArrayList<Point> getMoves()
	{
		ArrayList<Point> possibleMoves = new ArrayList<Point>();
		int y = getLoc().getY();
		int x = getLoc().getX();
		
		Point whiteOne = new Point(y-1,x);
		Point whiteTwo = new Point(y-2,x);
		Point whiteLeft = new Point(y-1,x-1);
		Point whiteRight = new Point(y-1,x+1);
		
		Point enPassantLeft = new Point(y,x-1);
		Point enPassantRight = new Point(y,x+1);
				
		Point blackOne = new Point(y+1,x);
		Point blackTwo = new Point(y+2,x);
		Point blackLeft = new Point(y+1,x-1);
		Point blackRight = new Point(y+1,x+1);

		return possibleMoves;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public boolean isMoveLegal(Point k){
		if (getColor() == "white") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() - 1 && k.getY() > 0) {
				return true;
			}
		} else if (getColor() == "black") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() + 1 && k.getY() > 0) {
				return true;
			}
		}
		return false;
	}

	//method for a pawn's starting move, they can move forward two spaces
	public void openingMove(Point k) {
		if (getColor() == "white") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() - 2 && k.getY() > 0) {
				getGrid().getSquare(k).set(this);
			}
		} else if (getColor() == "black") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() + 2 && k.getY() > 0) {
				getGrid().getSquare(k).set(this);
			}
		}
		moveCount++;
	}

	//only can be done if the pawn moved two spaces the first time
	public void enPassant(Point k) {
		
	}

	//checks if the pawn has reached the end of the board (where it can choose to promote)
	public boolean checkPromote(Pawn pawn) {
		if (getColor().equals("white")) {
			if(getLoc().getX() == 0) {
				return true;
			}
		}
		if (getColor().equals("black")) {
			if(getLoc().getY() == 7) {
				return true;
			}
		}

		return false;
	}

	public void promote() {

	}



}