public class Queen extends Piece {
	public Queen(Point k, String color) {
		super("Queen", color, k);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k,this);
		}
	}
	public boolean isMoveLegal(Point k) {
		int deltaX = super.getX() - k.getX();
		int deltaY = super.getY() - k.getY();
		if(k.getY() == super.getY()) {
			return true;
			
		}else if(k.getX() == super.getX()) {
			return true;

		}else if(deltaX == deltaY) {
			return true;

		}else if(deltaX == -deltaY) {
			return true;

		}
		return false;
	}
}