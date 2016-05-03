package Reversi;


public class Board {
	public static final int BOARD_SIZE = 8;

	private int gWidth;
	private int gHeight;

	private Masu[][] masus = new Masu[BOARD_SIZE][BOARD_SIZE];
	//Boardの上にMasuを作る

	public Board(int width, int height) { //参考コードは引数3つだけど２つでいいんじゃね？
		setgWidth(width);	//パネルサイズの800が入る
		setgHeight(height);
		for (int i = 0; i < BOARD_SIZE; i++){
			for (int j = 0; j < BOARD_SIZE; j++){
				masus[i][j] = new Masu(getgWidth()/BOARD_SIZE,getgWidth()/BOARD_SIZE*i,getgHeight()/BOARD_SIZE*j);
			}
		}

		}












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
