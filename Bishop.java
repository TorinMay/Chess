import  java.lang.Math.*;
public class Bishop extends Piece {
	private int x = 0;
	private int y = 0;
	public Bishop(Point k, String color){
		super("Bishop", color, k);
	}
	public void move(Point k){
		int j = getLoc().getY();
		int i = getLoc().getX();
		if(Math.abs(k.getY()-j) == Math.abs(k.getX()-i) && k.getY() < 8 && k.getX() < 8 && getGrid().get(k) = null){
			getGrid().set(k, this);
		}
	}
}
