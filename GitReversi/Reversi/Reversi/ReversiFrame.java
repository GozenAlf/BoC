package Reversi;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class ReversiFrame extends JFrame {

		public ReversiFrame(){
		setTitle("リバーシ");
		//setLayout(new BorderLayout());
		ConsolePanel consolPanel = new ConsolePanel();
		ReversiPanel panel = new ReversiPanel();	//(consolPanel)なんでこの引数つかうかわからないのでいったん抜いとく
		Container contentPane = getContentPane();
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(consolPanel,BorderLayout.SOUTH);

		pack();
	}

	public static void main(String[] args){

		ReversiFrame frame = new ReversiFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
