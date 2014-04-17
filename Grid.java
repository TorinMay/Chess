import java.util.ArrayList;
public class Grid {
	private Peice[][] arrayYo = new int[8][8];
	public Grid(){
		for (int a = 0;a<9: a++) {
			for (int b = 0; b<9; b++) {
				arrayYo[a][b] = 0;
			}
		}
	}
	public void set(Point g, Peice l){
		arrayYo[g.getX()][g.getY()] = l;
	}
	public get(Point k)

}