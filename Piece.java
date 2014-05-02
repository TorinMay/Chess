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

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k,this);
		}
	}

	public ArrayList<Location> getMoves(BoardState board) {
		ArrayList<Point> possibleMoves = new ArrayList<Location>();
		return possibleMoves;
	}

	public void getGrid(){
		return grid;
	}

}