public class Rook extends Piece{
	
	public Rook(Point p, String color) {
		super("Rook", color, p);
	}

	public void move() {
		
	}

	public boolean isMoveLegal(Point k) {
		if(k.getY() == getLoc().getY()) {
			return true;
		}else if(k.getX() == getLoc().getX()) {
			return true;
		}
	}
}