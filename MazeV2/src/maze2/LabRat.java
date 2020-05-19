package maze2;

public class LabRat {
	private LabPosition _curPos;
	private boolean _facingLeft = true;
	private int[][] _starts = {{1, 1, 5, 6, 8},
							   {7, 4, 1, 1, 3}};
	
	public LabRat(LabDesign z, int lvl) {
		_curPos = new LabPosition(getRatStart(lvl).getRow(), getRatStart(lvl).getCol());
	}
	
	public LabPosition getPos() {
		return _curPos;
	}
	
	public LabPosition getRatStart(int lvl) {
		int x = _starts[0][lvl];
		int y = _starts[1][lvl];
		return new LabPosition(x, y);
	}
	
	public void move(LabDesign l, int lvl){
		if(_curPos.getCol() - 1 >= 0 && !l.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1] && _facingLeft){
			_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);
		}
		else if(_curPos.getCol() + 1 < l.getLab(lvl)[0].length && !l.getLab(lvl)[_curPos.getRow()][_curPos.getCol() + 1] && !_facingLeft){
			_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);
		}
		else{
			_facingLeft = !_facingLeft;
		}
	}
}
