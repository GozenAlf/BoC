package Reversi;

import java.awt.Dimension;

import javax.swing.JPanel;


public class ReversiPanel extends JPanel{
	private static final int PANEL_WIDTH  =800;
	private static final int PANEL_HEIGHT =800;




	public ReversiPanel(){		//(ConsolePanel consolPanel)なんでこの引数使うか不明なのでいったん抜いとく
		setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));


	}



}
