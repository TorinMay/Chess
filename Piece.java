public class Piece{

	private String type;
	private Point location;
	private String color;
	private Grid grid = new Grid();

	public Piece(String a, String color, Point x){
		type = a;
		location = x;
	}

	public String getName() {
		return type;
	}

	public Point getLoc() {
		return location;
	}

	public String getColor() {
		return color;
	}

	public void setLoc(Point p) {
		location = p;
	}

	public void move(Point p) {
		if (grid.get(p) == null) {
			location = p;
		}
	}
	public void getGrid(){
		return grid;
	}

}