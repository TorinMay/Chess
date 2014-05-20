import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.util.ArrayList;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Piece{

	private String type;
	private Point location;
	private String col;
	private Image image;
	private Grid g;

	public Piece(String a, String color, Point x, Grid grid){
		g = grid;
		type = a;
		location = x;
		this.col = color;
		this.image = Piece.loadImage(a, color);
	}

	private static Image loadImage(String name, String color) {
		String path = null;
		Image image = null;

		try {
			path = "img" + File.separator + name + "_" + color + ".png";
			//path = "images/asdfsad.jpg";
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;

	}

	public String getName() {
		return type;
	}

	public Point getLoc() {
		return location;
	}

	public String getColor() {
		return col;
	}

	public void setLoc(Point p) {
		location = p;
	}

	public Image getImage() {
		return image;
	}

	public void move(Point k) {
		if (isMoveLegal(k)) {
			grid.set(k,this);
		}
	}
	public Grid getGrid(){
		return g;
	}

	public void draw(Graphics g) {
		g.drawImage(image, location.getX(), location.getY(), 120, 120, null);
	}

	public ArrayList<Point> getMoves(Point k) {
		ArrayList<Point> possibleMoves = new ArrayList<Point>();
		return possibleMoves;
	}
	public boolean isMoveLegal(Point k) {
		if(k.getY() > 9 && k.getX()<0 && k.getY() <0 && k.getX()> 9){
			return true;
		}
		return false;
	}

}