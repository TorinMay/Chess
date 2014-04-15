public class Piece{

	private String type;
	private Point location;

	public Piece(String a, Point x){
		type = a;
		location = x;
	}

	public void move(Point p) {
		if (p == null) {
			location = p;
		}
	}

}