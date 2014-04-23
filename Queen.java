public class Queen extends Piece {
	public Queen(Point k, String color) {
		super("Queen", color, k);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			getGrid().set(k,this);
		}
	}
	public boolean isMoveLegal(Point k) {
		int deltaX = getLoc().getX() - k.getX();
		int deltaY = getLoc().getY() - k.getY();
		if(k.getY() == getLoc().getY()) {
			return true;
			
		}else if(k.getX() == getLoc().getX()) {
			return true;

		}else if(deltaX == deltaY) {
			return true;

		}else if(deltaX == -deltaY) {
			return true;

		}
		return false;
	}
}