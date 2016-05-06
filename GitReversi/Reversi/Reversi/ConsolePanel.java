package Reversi;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
//import java.awt.Graphics;

public class ConsolePanel extends JPanel{
	public ConsolePanel() {
	}
	private static final int PANEL_WIDTH = 800;
	private static final int PANEL_HEIGHT = 50;

	//str

	public void ConsolPane(){
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		setBackground(Color.BLACK);
	}

	//public str

	/*public void paintComponent(Graphics g){


	}
	*/


}
