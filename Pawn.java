public class Pawn extends Piece{

	public Pawn(Point p) {
		super("Pawn", p);
	}

	public void move(Point k) {
		if (k.getX() == super.location.getX() && k.getY() < 8 && k.getY > 0) {
			super.location == k;
		} else if (k.getY() == super.location.getY() && k.getX() < 8 && k.getX > 0) {
			super.location == k;
		}
	}



}