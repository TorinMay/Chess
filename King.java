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
		int j = getLoc().getY();
		int i = getLoc().getX();

		if(k.getY() >= (j-1) && k.getY() <= (j+1)) {
			if(k.getX() >= (i-1) && k.getX() <= (i+1)) {
				return true;
			}
		}
		return false;
	}
}