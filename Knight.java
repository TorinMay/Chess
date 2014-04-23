import  java.lang.Math.*;

public class Knight extends Piece{
	public Knight(Point k, String color){
		super("Knight", k);
	}
	public void move(Point k){
		int j = getLoc().getY();
		int i = getLoc().getX();
		int lololo = k.getY();
		int ololol = k.getX();

		if((lololo-j)/2 == ololol-i && lololo < 8 && ololol < 8 && getGrid().get(k) == null){
			getGrid.set(k, this);
		}
		else if(lololo-j == (ololol-i)/2 && lololo < 8 && ololol < 8 && getGrid().get(k) == null){
			getGrid.set(k, this);
		}
	}
}