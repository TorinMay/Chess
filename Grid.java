import java.awt.*;

public class Grid {
	private Square[][] arrayYo = new Square[8][8];
	private Point l;
	public Grid(){
		for (int a = 0;a<8; a++) {
			for (int b = 0; b<8; b++) {
				if(a%2 == 0){
					arrayYo[a][b] = new Square("Black",l =new Point(a,b), null);
				}
				else{
					arrayYo[a][b] = new Square("White",l =new Point(a,b),null);
				}
			}
		}
	}

	public void set(Point g, Piece l){
		this.getSquare(g).set(l);
	}
	
	public Square getSquare(Point k){
		return arrayYo[k.getX()][k.getY()];
	}

}