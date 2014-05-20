public class King extends Piece {
	public King(Point k, String color,Grid grid) {
		super("King", color, k, grid);
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			getGrid().set(k, this);
		}
	}
	public boolean isMoveLegal(Point k) {

		int j = 0;
		int i = 0;
		Point superLoc = super.getLoc();
		int superX = superLoc.getX();
		int superY = superLoc.getY();
		if((k.getY() >= (superY-1)) && (k.getY() <= (superY+1))) {
			if((k.getX() >= (superX-1)) && (k.getX() <= (superX+1))) {
			j = getLoc().getY();
			i = getLoc().getX();
			}	
		}
		if(k.getY() >= (j-1) && k.getY() <= (j+1)) {
			if(k.getX() >= (i-1) && k.getX() <= (i+1)) {
				return true;
			}
		}
		return false;
	}
}