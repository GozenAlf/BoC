package Reversi;
public class Masu {
	
	
	private int gX;
	private int gY;
	private int gSize;

	public Masu(int size, int x, int y) {
		setgSize(size);
		setgX(x);
		setgY(y);
		
	}

	
	
	
	
	public int getSize() {
		return this.gSize;
	}

	public void setgSize(int size) {
		this.gSize = size;
	}
	public int getgX() {
		return this.gX;
	}

	public void setgX(int gX) {
		this.gX = gX;
	}

	public int getgY() {
		return this.gY;
	}

	public void setgY(int gY) {
		this.gY = gY;
	}



	//コンストラクタ

	//setStone Masuのstoneに引数のstoneを

	//getStone stone型のstoneを返す

	//removeStone

	//toString 空か文字を返す（いらない？

	//draw(これはGUI側でやる？
}
