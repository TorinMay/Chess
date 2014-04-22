public class Queen extends Piece {
	public Queen(Point k) {
		super("Queen", color, k);
	}

	public Location move(Point k) {
		Location locY = new Location();
		Location locX = new Location();
		if(k.getY() == (super.getY()) && k.getX() == (super.getX())) {
			locY = (super.getY()-1);
			locX = (super.getX()-1);
		}
	}
}