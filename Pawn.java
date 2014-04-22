public class Pawn extends Piece{

	int moveCount = 0;

	public Pawn(Point p, Color color) {
		super("Pawn", color, p);
	}

	public void move(Point k) {
		if (moveCount == 0) {
			openingMove();
		}
		if (color == "white") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() - 1 && k.getY > 0) {
				super.getLoc == super.setLoc(k);
		} else if (color == "black") {
			if (k.getX() == super.setLoc.getX() && k.getY() == super.getLoc() + 1 && k.getY > 0) {
				super.getLoc == super.setLoc(k);
		}
		
	}

	//method for a pawn's starting move, they can move forward one or two spaces
	public void openingMove(Point k) {
		
	}

	public void enPassant(Point k) {
		if (count() == 1) {
			
		}
	}



}