package maze2;

public class LabString {
	//instance variables
	private String _s = "";
	private boolean[][] _l = new boolean[11][11];
	//constructor
	public LabString() {
		
	}
	
	//uses the labdesign 2d boolean arrays and updates it every move to represent the entities in the maze correctly as a string
	public String updateLab(LabDesign l, int x, LabPlayer p, LabQuestion q1, 
			LabQuestion q2, LabQuestion q3, LabQuestion q4, LabQuestion q5, LabQuestion q6, 
			LabMinotaur m, LabRat rat) {
		_s = "";
		_l = l.getLab(x);
		for (int r = 0; r < _l.length; r++) {
			for (int c = 0; c < _l[0].length; c++) {
				if (_l[r][c]) {
					_s += "█";
				} else if (r == p.getPos().getRow() && c == p.getPos().getCol()) {
					_s += "◈";
				} else if (r == m.getPos().getRow() && c == m.getPos().getCol()) {
					_s += "︸";
				} else if (r == rat.getPos().getRow() && c == rat.getPos().getCol()) {
					_s += ".⍩";
				}  else if (r == q1.getPos().getRow() && c == q1.getPos().getCol()) {
					_s += "◌";
				} else if (r == q2.getPos().getRow() && c == q2.getPos().getCol()) {
					_s += "◌";
				} else if (r == q3.getPos().getRow() && c == q3.getPos().getCol()) {
					_s += "◌";
				} else if (r == q4.getPos().getRow() && c == q4.getPos().getCol()) {
					_s += "◌";
				} else if (r == q5.getPos().getRow() && c == q5.getPos().getCol()) {
					_s += "◌";
				} else if (r == q6.getPos().getRow() && c == q6.getPos().getCol()) {
					_s += "◌";
				} else {
					_s += "░";
				}
			}
			_s += "\n";
		}
		return _s; 
	}
}
