
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Grid extends JPanel{

	public static Grid grid;
	static BufferedImage kingImage = null;
	private Square[][] arrayYo = new Square[8][8];
	private Point l;
	private King king;
	private Queen queen;
	private Pawn pawn;
	private Bishop bishop;
	private Knight knight;
	private Rook rook;
	private Graphics graph;


	public Grid(Grid grid){
		this.grid = grid;
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
		for(int i=0;i<8;i++){
			for(int z = 0;z<8;z++){
				if(i==1){
					pawn = new Pawn(new Point(i,z),"black",this);
					arrayYo[i][z].set(pawn);
					arrayYo[i][z].paint(graph);
				}else if(i==6){
					pawn = new Pawn(new Point(i,z),"black",this);
					arrayYo[i][z].set(pawn);
					arrayYo[i][z].paint(graph);
				}
			}
		}
	}	

	public static void main(String[] args) {
	
	}
	public void set(Point g, Piece l){
		this.getSquare(g).set(l);
	}
	
	public Square getSquare(Point k){
		return arrayYo[k.getX()][k.getY()];
	}
	public void paint(Graphics g) {
		graph = g;
		String a = "";
		for (int i=0; i < numCellsX; i++) {
			boolean isEven = ((i%2) == 0);
			if(isEven) {
				a = "White";
			}else {
				a = "Black";
			}
			for (int j=0; j < numCellsY; j++) {
				int x = i * cellWidth;
				int y = j * cellHeight;
				if (a.equals("Black")) {
					a = "White";
				}else {
					a = "Black";
				}
				Point z = new Point(i,j);
				Square square = new Square(a,z,null);
				square.paint(i,j,g);				
				Piece piece = grid.getSquare(z).get();
				if (piece != null) {
					g.drawImage(kingImage, x, y, cellWidth, cellHeight, null);
				}
			}

		}
		
	}
		public static void readImgs() {
			try {
	    		kingImage = ImageIO.read(new File("/Users/apcs/projects/Chess/img/king_black.png"));
			} catch (IOException e) {
				System.out.println("Error reading file " + e.getMessage());
			}
		}
}