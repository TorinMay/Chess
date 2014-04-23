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
		if((k.getY() >= (super.getY()-1) && (k.getY() <= (super.getY()+1)) {
			if((k.getX() >= (super.getX()-1) && (k.getX() <= (super.getX()+1)) {
				return true;
			}
		}
		return false;
	}
}