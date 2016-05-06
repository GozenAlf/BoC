package Reversi;

import java.awt.Color;

public class Stone {
	
	public static final int BLACK = 1;
	public static final int WHITE = -1;
	public static final int WALL = 2;
	public static final int EMPTY = 0;
	
	private Color color;
	
	public Stone(Color color){
		this.color=color;
	}
	
	
	/*public void draw(Graphics g, int size , int x , int y){  //石を描写
		g.setColor(color);
		g.fillOval(x-size/2, y-size/2, size, size);	
	}*/
}
