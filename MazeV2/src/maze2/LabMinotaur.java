package maze2;


public class LabMinotaur {
	//instance variables
	private LabPosition _curPos;
	private boolean _facingLeft = true;
	private int[][] _starts = {{8, 4, 6, 8, 4},
							   {1, 4, 9, 1, 1}};
	//getter method
	public LabPosition getPos() {
		return _curPos;
	}
	
	//constructor
	//creates a minotaur at the starting position previously decided on based on what level the player is on
	public LabMinotaur(LabDesign z, int lvl){
		_curPos = new LabPosition(getMinotaurStart(lvl).getRow(), getMinotaurStart(lvl).getCol());
	}
	
	//basic move function
	//moves the minotaur towards the position of the player
	public void move(LabDesign z, int lvl){
		if(_curPos.getCol() - 1 >= 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1] && _facingLeft){
			_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);;
		}
		else if(_curPos.getCol() + 1 < z.getLab(lvl)[0].length && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() + 1] && !_facingLeft){
			_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);
		}
		else{
			_facingLeft = !_facingLeft;
		}
	}
	
	//more advanced move function
	//checks for more factors when moving towards the player, based on row and column distances
	public void hardMove(LabDesign z, LabPlayer p, int lvl){
		int distRow = _curPos.getRow() - p.getPos().getRow();
		int distCol = _curPos.getCol() - p.getPos().getCol();
		if(distRow > 0){
			if(!z.getLab(lvl)[_curPos.getRow() - 1][_curPos.getCol()]){
				_curPos = new LabPosition(_curPos.getRow()-1, _curPos.getCol());
			}
			else{
				if(distCol > 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);;
				}
				else if(distCol < 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() + 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);;
				}
				else if(!z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);;
				}
				else{
					_curPos = new LabPosition(_curPos.getRow()+1, _curPos.getCol());
				}
			}
		}
		else if(distRow == 0){
			if(distCol > 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1]){
				_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);
			}
			else if(distCol < 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() + 1]){
				_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);
			}
			/*else if(distCol > 0!z.getMaze()[_curPos.getRow() + 1][_curPos.getCol()]){
				_curPos = new Position(_curPos.getRow()+1, _curPos.getCol());
			}
			else if(distCol > 0!z.getMaze()[_curPos.getRow() - 1][_curPos.getCol()]){
				_curPos = new Position(_curPos.getRow()-1, _curPos.getCol());;
			} */
			else{
				_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);
			}
		}
		else{
			if(!z.getLab(lvl)[_curPos.getRow() + 1][_curPos.getCol()]){
				_curPos = new LabPosition(_curPos.getRow()+1, _curPos.getCol());
			}
			else{
				if(distCol > 0 && !z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);;
				}
				else if(!z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() + 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);;
				}
				else if(!z.getLab(lvl)[_curPos.getRow()][_curPos.getCol() - 1]){
					_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);;
				}
				else{
					_curPos = new LabPosition(_curPos.getRow()-1, _curPos.getCol());
				}
			}
		}
	}
	
	//gets the start position of the minotaur based on what level the player is on, used in constructor
	public LabPosition getMinotaurStart(int lvl) {
		int x = _starts[0][lvl];
		int y = _starts[1][lvl];
		return new LabPosition(x, y);
	}
}
