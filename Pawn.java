import java.util.ArrayList;

public class Pawn extends Piece{

	private int moveCount = 0;

	public Pawn(Point p, String color) {
		super("Pawn", color, p);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k,this);
		}
	}

	public ArrayList<Location> getMoves(BoardState board)
	{
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		int y = getLoc().getY();
		int x = getLoc().getX();
		
		Location whiteOne = new Point(y-1,x);
		Location whiteTwo = new Point(y-2,x);
		Location whiteLeft = new Point(y-1,x-1);
		Location whiteRight = new Point(y-1,x+1);
		
		Location enPassantLeft = new Point(y,x-1);
		Location enPassantRight = new Point(y,x+1);
				
		Location blackOne = new Point(y+1,x);
		Location blackTwo = new Point(y+2,x);
		Location blackLeft = new Point(y+1,x-1);
		Location blackRight = new Point(y+1,x+1);

		return possibleMoves;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public boolean isMoveLegal(){
		if (color == "white") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() - 1 && k.getY() > 0) {
				return true;
			}
		} else if (color == "black") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() + 1 && k.getY() > 0) {
				return true;
			}
		}
	}

	//method for a pawn's starting move, they can move forward two spaces
	public void openingMove(Point k) {
		if (color == "white") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() - 2 && k.getY() > 0) {
				grid.set(k, this);
			}
		} else if (color == "black") {
			if (k.getX() == getLoc().getX() && k.getY() == getLoc().getY() + 2 && k.getY() > 0) {
				grid.set(k, this);
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
			if(getLoc(getX()) == 0) {
				return true;
			}
		}
		if (getColor().equals("black")) {
			if(getLoc(getY()) == 7) {
				return true;
			}
		}

		return false;
	}

	public void promote() {

	}



}