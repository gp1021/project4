package maze2;

import javax.swing.*;

public class WindowLabyrinth {
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg); //shows the user a jpane and asks them to enter a response
	}
	
	public void println(String msg) {
		System.out.println(msg); //prints out a msg
	}
	
	//show the string 2d array/maze, along with the buttons and the level number as a jpane
	public int option1(String[] options, String map, int lvl) {
		return JOptionPane.showOptionDialog(null, map, "Level " + lvl, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s); //shows the user a jpane message
		
	}

	public void msg2(String[][] strings) {
		JOptionPane.showMessageDialog(null, strings); //shows the user a 2d string array
		
	}


}
