public class Rook extends Piece{
	
	public Rook(Point p, Color color) {
		super("Rook", color, p);
	}

	public void move() {
		
	}

	public boolean isMoveLegal() {
		if(k.getY() == getLoc().getY()) {
			return true;
		}else if(k.getX() == getLoc().getX()) {
			return true;
		}
	}
}