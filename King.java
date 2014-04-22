public class King extends Piece {
	public King(Point k) {
		super("King", color, k);
	}

	public void move(Point k) {
		if(k.getY() == (super.getY()-j) && k.getX() == (super.getX()-i)) {
			
		}
	}
}