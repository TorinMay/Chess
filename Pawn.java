public class Pawn extends Piece{

	private int moveCount = 0;

	public Pawn(Point p, Color color) {
		super("Pawn", color, p);
	}

	public void move(Point k) {
		if (color == "white") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() - 1 && k.getY > 0) {
				grid.set(k, this);
			}
		} else if (color == "black") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() + 1 && k.getY > 0) {
				grid.set(k, this);
			}
		}
		moveCount++;
	}

	public int getMoveCount() {
		return moveCount;
	}

	//method for a pawn's starting move, they can move forward two spaces
	public void openingMove(Point k) {
		if (color == "white") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() - 2 && k.getY > 0) {
				grid.set(k, this);
			}
		} else if (color == "black") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() + 2 && k.getY > 0) {
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
		if (super.getColor().equals("white")) {
			if(super.getLoc(getX()) == 0) {
				return true;
			}
		}
		if (super.getColor().equals("black")) {
			if(super.getLoc(getY()) == 7) {
				return true;
			}
		}

		return false;
	}

	public void promote() {

	}



}