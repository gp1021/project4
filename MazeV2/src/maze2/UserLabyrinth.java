package maze2;

import javax.swing.*;

public class UserLabyrinth {
	//instance variables
	private WindowLabyrinth _w;
	private LabDesign _l;
	private LabDesign _l2;
	private LabDesign _l3;
	private LabDesign _l4;
	private LabDesign _l5;
	private LabPlayer _p;
	private LabQuestion _q1;
	private LabQuestion _q2;
	private LabQuestion _q3;
	private LabQuestion _q4;
	private LabQuestion _q5;
	private LabQuestion _q6;
	private LabString _s;
	private LabMinotaur _m;
	private LabRat _r;
	
	public static final String[] BUTTONS = {"North", "South", "West", "East", "Help", "Exit"};
	
	//constructor
	//contains the game mechanics, step by step, and what the player sees while they're playing
	public UserLabyrinth() {
		_w = new WindowLabyrinth();
		_l = new LabDesign();
		_l2 = new LabDesign();
		_l3 = new LabDesign();
		_l4 = new LabDesign();
		_l5 = new LabDesign();
		_p = new LabPlayer();
		_q1 = new LabQuestion(_l);
		_q2 = new LabQuestion(_l);
		_q3 = new LabQuestion(_l);
		_q4 = new LabQuestion(_l);
		_q5 = new LabQuestion(_l);
		_q6 = new LabQuestion(_l);
		_s = new LabString();
		
		
		if (checkEqual(_q1.getPos(), _q2.getPos()) || checkEqual(_q1.getPos(), _q3.getPos()) ||
				checkEqual(_q1.getPos(), _q4.getPos()) || checkEqual(_q1.getPos(), _q5.getPos()) ||
				checkEqual(_q1.getPos(), _q6.getPos())) {
			_q1 = new LabQuestion(_l);
		}
		if (checkEqual(_q2.getPos(), _q1.getPos()) || checkEqual(_q2.getPos(), _q3.getPos()) ||
				checkEqual(_q2.getPos(), _q4.getPos()) || checkEqual(_q2.getPos(), _q5.getPos()) ||
				checkEqual(_q2.getPos(), _q6.getPos())) {
			_q2 = new LabQuestion(_l);
		}
		if (checkEqual(_q3.getPos(), _q1.getPos()) || checkEqual(_q3.getPos(), _q2.getPos()) ||
				checkEqual(_q3.getPos(), _q4.getPos()) || checkEqual(_q3.getPos(), _q5.getPos()) ||
				checkEqual(_q3.getPos(), _q6.getPos())) {
			_q3 = new LabQuestion(_l);
		}
		if (checkEqual(_q4.getPos(), _q1.getPos()) || checkEqual(_q4.getPos(), _q2.getPos()) ||
				checkEqual(_q4.getPos(), _q3.getPos()) || checkEqual(_q4.getPos(), _q5.getPos()) ||
				checkEqual(_q4.getPos(), _q6.getPos())) {
			_q4 = new LabQuestion(_l);
		}
		if (checkEqual(_q5.getPos(), _q1.getPos()) || checkEqual(_q5.getPos(), _q2.getPos()) ||
				checkEqual(_q5.getPos(), _q3.getPos()) || checkEqual(_q5.getPos(), _q4.getPos()) ||
				checkEqual(_q5.getPos(), _q6.getPos())) {
			_q5 = new LabQuestion(_l);
		}
		if (checkEqual(_q6.getPos(), _q1.getPos()) || checkEqual(_q6.getPos(), _q2.getPos()) ||
				checkEqual(_q6.getPos(), _q3.getPos()) || checkEqual(_q6.getPos(), _q4.getPos()) ||
				checkEqual(_q6.getPos(), _q5.getPos())) {
			_q5 = new LabQuestion(_l);
		}
		
		_w.msg1("𝓜𝓐𝓩𝓔 2.0 \n\n"
				+ "You wake up with no recollection of how you got there.\n\n"
				+ "Yet it feels, 𝙛𝙖𝙢𝙞𝙡𝙞𝙖𝙧 \n\n"
				+ "You take in your strange surroundings, once more.\n"
				+ "This is different than last time, more options to choose from. \n"
				+ "It is your s̶e̶c̶o̶n̶d̶  chance.\n\n"
				+ "Take it."); //intro
		_m = new LabMinotaur(_l, 0);
		_r = new LabRat(_l, 0);
		while (!(_p.getPos().getRow() == _l.getEnd().getRow() && 
				_p.getPos().getCol() == _l.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l, 0, _p, _q1, _q2, _q3, _q4, _q5, _q6, _m, _r), 1);
			
			_p.move(_l, 0, x, _w);
			_m.hardMove(_l, _p, 0);
			_r.move(_l, 0);
			askQuestion();
			whispers();
			checklost(_p, _m, _r);
		}
		_p.startPos();
		
		_m = new LabMinotaur(_l2, 1);
		_r = new LabRat(_l2, 1);
		while (!(_p.getPos().getRow() == _l2.getEnd().getRow() && 
				_p.getPos().getCol() == _l2.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l2, 1, _p, _q1, _q2, _q3, _q4, _q5, _q6, _m, _r), 2);
			
			_p.move(_l2, 1, x, _w);
			_m.hardMove(_l2, _p, 1);
			_r.move(_l2, 1);
			askQuestion();
			whispers();
			checklost(_p, _m, _r);
		}
		_p.startPos();
		
		_m = new LabMinotaur(_l3, 2);
		_r = new LabRat(_l3, 2);
		while (!(_p.getPos().getRow() == _l3.getEnd().getRow() && 
				_p.getPos().getCol() == _l3.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l3, 2, _p, _q1, _q2, _q3, _q4, _q5, _q6, _m, _r), 3);
			
			_p.move(_l3, 2, x, _w);
			_m.hardMove(_l3, _p, 2);
			_r.move(_l3, 2);
			askQuestion();
			whispers();
			checklost(_p, _m, _r);
		}
		_p.startPos();
		
		_m = new LabMinotaur(_l4, 3);
		_r = new LabRat(_l4, 3);
		while (!(_p.getPos().getRow() == _l4.getEnd().getRow() && 
				_p.getPos().getCol() == _l4.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l4, 3, _p, _q1, _q2, _q3, _q4, _q5, _q6, _m, _r), 4);
			
			_p.move(_l4, 3, x, _w);
			_m.hardMove(_l4, _p, 3);
			_r.move(_l4, 3);
			askQuestion();
			whispers();
			checklost(_p, _m, _r);
		}
		_p.startPos();
		
		_m = new LabMinotaur(_l5, 4);
		_r = new LabRat(_l5, 4);
		while (!(_p.getPos().getRow() == _l5.getEnd().getRow() && 
				_p.getPos().getCol() == _l5.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l5, 4, _p, _q1, _q2, _q3, _q4, _q5, _q6, _m, _r), 5);
			
			_p.move(_l5, 4, x, _w);
			_m.hardMove(_l5, _p, 4);
			_r.move(_l5, 4);
			askQuestion();
			whispers();
			checklost(_p, _m, _r);
		}
		
	//ENDING
		_w.msg1("As you exit the last maze, sunlight floods your vision.\n\n"
				+ "You can no longer hear the beckoning whispers in the wind.\n\n"
				+ "You've made it. Have you really, though?");
		_w.msg1("Congratulations, you've made it through Maze 2.0.");
	
	//_w.msg1(_s.updateLab(_l, _p, _q)); labyrinth shell
	}
	public void checklost(LabPlayer p, LabMinotaur m, LabRat r) {
		if ((p.getPos().getRow() == m.getPos().getRow() && 
				p.getPos().getCol() == m.getPos().getCol())) {
			_w.msg1("The minotaur gets you. \n\n"
					+ "As your vision blurs, you find yourself asking,\n\n\n"
					+ "Where did I go wrong?");
			_w.msg1("You did not make it through Maze 2.0! Maybe you\n"
					+ "should try again?");
			System.exit(0);
		}
		if ((p.getPos().getRow() == r.getPos().getRow() && 
				p.getPos().getCol() == r.getPos().getCol())) {
			_w.msg1("The rat runs into you and you feel a seering pain. \n\n"
					+ "As your vision blurs, you find yourself asking,\n\n\n"
					+ "Where did I go wrong?");
			_w.msg1("You did not make it through Maze 2.0! Maybe you\n"
					+ "should try again?");
			System.exit(0);
		}
	}
	
	//checks if two positions are the same and returns a boolean response
	public boolean checkEqual(LabPosition x, LabPosition y) {
		if ((x.getRow() == y.getRow()) && (x.getCol() == y.getCol())) {
			return true;
		} else {
			return false;
		}
	}
	
	//asks the user a question if they are standing in a question position, and checks if they're answer is correct or not compared to the real answer
	public void askQuestion() {
		String question;
		String answer;
		if (checkEqual(_p.getPos(), _q1.getPos())) {
			_q1.makeArray();
			question = _q1.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q1.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q2.getPos())) {
			_q2.makeArray();
			question = _q2.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q2.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q3.getPos())) {
			_q3.makeArray();
			question = _q3.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q3.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q4.getPos())) {
			_q4.makeArray();
			question = _q4.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q4.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q5.getPos())) {
			_q5.makeArray();
			question = _q5.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q5.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q6.getPos())) {
			_q6.makeArray();
			question = _q6.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q6.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else {
			
		}
	}
	
	//shows extra jpanes with messages to add to the game's story
	public void whispers() {
		LabPosition a = new LabPosition(7, 3);
		LabPosition b = new LabPosition(4, 1);
		LabPosition c = new LabPosition(1, 5);
		LabPosition d = new LabPosition(3, 9);
		LabPosition e = new LabPosition(9, 7);
		if (checkEqual(_p.getPos(), a)) {
			_w.msg1("You hear whispers.");
		}
		if (checkEqual(_p.getPos(), b)) {
			_w.msg1("Stay.");
		}
		if (checkEqual(_p.getPos(), c)) {
			_w.msg1("Stay here.");
		}
		if (checkEqual(_p.getPos(), d)) {
			_w.msg1("Why do you want to leave?");
		}
		if (checkEqual(_p.getPos(), e)) {
			_w.msg1(" S t a y . ");
		}
	}
	
}
