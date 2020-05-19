package maze2;

import javax.swing.*;

public class WindowLabyrinth {
	
	
	public void msg(ImageIcon icon) {
		JOptionPane.showMessageDialog(null, icon); //sends a message to the user
	}
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public void println(String msg) {
		System.out.println(msg);
	}
	
	public int option1(String[] options, String map, int lvl) {
		return JOptionPane.showOptionDialog(null, map, "Level " + lvl, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s);
		
	}

	public void msg2(String[][] strings) {
		JOptionPane.showMessageDialog(null, strings);
		
	}

	public int option(String[] replay, String string) {
		// TODO Auto-generated method stub
		return JOptionPane.showOptionDialog(null, string, "Replay", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, replay, replay[0]);
	}

}
