public class Pawn extends Piece{

	private int moveCount = 0;

	public Pawn(Point p, Color color) {
		super("Pawn", color, p);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k,this);
		}
	}

	public int getMoveCount() {
		return moveCount;
	}

	public boolean isMoveLegal(){
		if (color == "white") {
			if (k.getX() == setLoc.getX() && k.getY() == getY() - 1 && k.getY > 0) {
				return true;
			}
		} else if (color == "black") {
			if (k.getX() == setLoc.getX() && k.getY() == getY() + 1 && k.getY > 0) {
				return true;
			}
		}
	}

	//method for a pawn's starting move, they can move forward two spaces
	public void openingMove(Point k) {
		if (color == "white") {
			if (k.getX() == setLoc.getX() && k.getY() == getY() - 2 && k.getY > 0) {
				grid.set(k, this);
			}
		} else if (color == "black") {
			if (k.getX() == setLoc.getX() && k.getY() == getY() + 2 && k.getY > 0) {
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