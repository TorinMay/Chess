import java.util.ArrayList;

public class Piece{

	private String type;
	private Point location;
	private String color;
	protected Grid grid = new Grid();

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

	public ArrayList<Point> getMoves(Point k) {
		ArrayList<Point> possibleMoves = new ArrayList<Point>();
		return possibleMoves;
	}

	public Grid getGrid(){
		return grid;
	}

	public boolean isMoveLegal(Point k) {
		if(k.getY() > 9 && k.getX()<0 && k.getY() <0 && k.getX()> 9){
			return true;
		}
		return false;
	}

}