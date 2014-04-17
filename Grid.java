import java.util.ArrayList;
public class Grid {
	private Piece[][] arrayYo = new int[8][8];
	public Grid(){
		for (int a = 0;a<9: a++) {
			for (int b = 0; b<9; b++) {
				arrayYo[a][b] = 0;
			}
		}
	}
	public void set(Point g, Piece l){
		arrayYo[g.getX()][g.getY()] = l;
	}
	public Peice get(Point k){
		return arrayYo[k.getX()][k.getY()];
	}

}