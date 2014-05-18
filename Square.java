import java.awt.*;
import java.awt.event.*;
public class Square extends JButton{
	private Color c;
	private Point b;
	private Graphics g;
	private Piece z;
	public Square(String a, Point b, Piece k){
		if(a.equals("Black")){
			c = new Color(54,29,0);
		}
		else{
			c = new Color(255,240,195);
		}
		this.b = b;
		z=k;
	}
	public void paint(int x, int y, Graphics g){
		g.setColor(this.c);
		g.fillRect(x*120,y*120,120,120);
	}
	public void set(Piece l){
		this.z=l;
	}
	public Piece get(){
		return z;
	}

}