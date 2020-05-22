package maze2;

public class LabPosition {
	//instance variables
	private int _r;
	private int _c;
	
	//constructor
	//creates a position object that contains the row and column of an object
	public LabPosition(int row, int col) {
		_r = row;
		_c = col;
	}
	
	//getter methods
	public int getRow() { return _r; }
	public int getCol() { return _c; }
	
	
}
