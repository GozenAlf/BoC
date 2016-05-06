package Reversi;

import java.awt.Color;
import java.awt.Graphics;


public class Board {
	public static final int BOARD_SIZE = 8;

	//public static int gSize;
	private int gWidth;
	private int gHeight;

	private Color backgroundColor = Color.green;
	private Color frameColor = Color.black;


	private int Masu[][] = new int[BOARD_SIZE+2][BOARD_SIZE+2]; //便宜上空枠を外周に

	public Board(int width, int height) { //参考コードは引数3つだけど２つでいいんじゃね？
		//setgSize();
		setgWidth(width);	//パネルサイズの800が入る
		setgHeight(height);
		draw(null, 10,gWidth,gHeight);//drawは勝手に呼び出される？
		init();

		}

	public void init(){		//初期化
		/*for (int x = 1; x < BOARD_SIZE+1; x++) {
			for (int y = 1; x < BOARD_SIZE+1; y++) {
				Masu[x][y]=Stone.EMPTY;
			}
		}*/

		for (int x = 1; x < BOARD_SIZE+1; x++) {
			Masu[x][0]=Stone.WALL;
			Masu[x][BOARD_SIZE+1]=Stone.WALL;
		}
		for (int y = 0; y < BOARD_SIZE+1; y++) {
			Masu[0][y]=Stone.WALL;
			Masu[BOARD_SIZE+1][y]=Stone.WALL;
		}

		Masu[4][4] = Stone.WHITE;
		Masu[5][5] = Stone.WHITE;
		Masu[4][5] = Stone.BLACK;
		Masu[5][4] = Stone.BLACK;
 	};

 	public void draw(Graphics g,int size, int x , int y){
 		g.setColor(backgroundColor);
		g.fillRect(10, 10, gWidth, gHeight);
		g.setColor(frameColor);
		g.drawRect(10, 10, gWidth, gHeight);
 	}

			/*if (stone != null) {
			stone.draw(g, (int) (gSize * stoneCoefficient), gX + (gSize / 2),
					gY + (gSize / 2));
 	}*/












	//以下getterとsetter
	public int getgWidth() {
		return gWidth;
	}

	public void setgWidth(int gWidth) {
		this.gWidth = gWidth;
	}

	public int getgHeight() {
		return gHeight;
	}

	public void setgHeight(int gHeight) {
		this.gHeight = gHeight;
	}

	//onStone石が置かれたときの挙動

	//turn over check stone position ???

	//石の数カウント　色を受けて数を返す

	//string beffer sb.tostring(なんかの文字返す）

	//draw masuにおそらく石を表示

	//out panelがNULLじゃないときパネルをアップデートする
}
