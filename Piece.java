public class Piece{

	private String type;
	private Point location;
	private Grid grid = new Grid();

	public Piece(String a, Point x){
		type = a;
		location = x;
	}

	public void move(Point p) {
		if (grid.get(p) == null) {
			location = p;
		}
	}

}