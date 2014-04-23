public class Square{
	private Color c;
	private Point b;
	private Graphics g;
	private Piece z;
	public Square(String a, Point b, Piece k){
		if(a.equals("Black")){
			c = new Color(62, 0, 36);
		}
		else{
			c = new Color(255,190,228);
		}
		this.b = b;
		z=k;
	}
	public void paint(int x, int y, Graphics g){
		g.setColor(this.c);
		g.fillRect(x*50+50,y*50+50,50,50);
	}
	public void set(Piece l){
		this.z=l;
	}
	public Piece get(){
		return z;
	}

}