import  java.lang.Math.*;
public class Bishop extends Piece {
	private int x = 0;
	private int y = 0
	public Bishop(Point k){
		super("Bishop", k);
	}
	public void move(Point k){
		if(Math.abs(super.k.getY()-y) == Math.abs(super.k.getX()-x) && super.k.getY() !> 8 super.k.getX !> 8){

		}
	}
}
