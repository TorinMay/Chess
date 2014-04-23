public class Grid {
	private Square[][] arrayYo = new Square[8][8];
	private Square q = new Square();
	private Point l;
	private Graphics g = new Graphics();
	public Grid(){
		for (int a = 0;a<9; a++) {
			for (int b = 0; b<9; b++) {
				if(a%2 == 0){
					arrayYo[a][b] = new Square("Black",l =new Point(a,b),g);
				}
				else{
					arrayYo[a][b] = new Square("White",l =new Point(a,b),g);
				}
			}
		}
	}

	public void set(Point g, Piece l){
		this.getSquare(g).setPiece(l);
	}
	public Square getSquare(Point k){
		return arrayYo[k.getX()][k.getY()];
	}

}