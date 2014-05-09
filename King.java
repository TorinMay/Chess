public class King extends Piece {
	public King(Point k, String color) {
		super("King", color, k);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k, this);
		}
	}
	public boolean isMoveLegal(Point k) {
		Point superLoc = super.getLoc();
		int superX = superLoc.getX();
		int superY = superLoc.getY();
		if((k.getY() >= (superY-1)) && (k.getY() <= (superY+1))) {
			if((k.getX() >= (superX-1)) && (k.getX() <= (superX+1))) {
				return true;
			}
		}
		return false;
	}
}