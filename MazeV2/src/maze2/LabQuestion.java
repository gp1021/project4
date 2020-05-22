package maze2;

import java.util.ArrayList;
import java.util.Collections;

public class LabQuestion {
	//instance variables
	private LabPosition _pos;
	int x;
	ArrayList<String> questions = new ArrayList<String>();
	
	//adds the questions to ask the player into a string arraylist
	public ArrayList<String> makeArray() {
		questions.add("scissors : cut :: pen : ___ ?");
		questions.add("What is 5 * 9 + 6 * 2 / 3? (don't write the number as a word)");
		questions.add("   1   \n"
				+ " 1 2 1 \n"
				+ "1 3 3 1\n"
				+ "What's the next line? (Don't include spaces)");
		questions.add("What is the only letter in scrabble that is worth 5 points?");
		questions.add("What’s the most malleable metal?");
		questions.add("What are moving left to right, right now?");
		questions.add("What do you throw out when you want to use it, but take in \n"
				+ "when you don’t want to use it?");
		questions.add("Who is the Roman equivalent of the Greek God Ares?");
		questions.add("What English word has 3 consecutive double letters?");
		questions.add("What is it that lives if it is fed, and dies if you give it a drink?");
		questions.add("What is the tip of a shoelace called?");
		questions.add("Who has won the most Oscars for acting?");
		return questions;
	}
	
	//constructor
	//gets a random position for the question and gives it a new position on the maze
	public LabQuestion(LabDesign l) {
		x = (int) Math.random() * 9;
		_pos = new LabPosition(l.getQPos().getRow(), l.getQPos().getCol());
	}
	
	//getter methods
	public LabPosition getPos() { return _pos; }
	//gets a random question and removes it from the list so it isn't asked again
	public String getQuestion() {
		/*ArrayList<String> questions = new ArrayList<String>();
		questions.add("scissors : cut :: pen : ___ ?");
		questions.add("What is 5 * 9 + 6 * 2 / 3? (don't write the number as a word)");
		questions.add("   1   \n"
				+ " 1 2 1 \n"
				+ "1 3 3 1\n"
				+ "What's the next line? (Don't include spaces)");
		questions.add("What is the only letter in scrabble that is worth 5 points?");
		questions.add("What’s the most malleable metal?");
		questions.add("What are moving left to right, right now?");
		questions.add("What do you throw out when you want to use it, but take in \n"
				+ "when you don’t want to use it?");
		questions.add("Who is the Roman equivalent of the Greek God Ares?");
		questions.add("What English word has 3 consecutive double letters?");
		questions.add("What is it that lives if it is fed, and dies if you give it a drink?");
		questions.add("What is the tip of a shoelace called?");
		questions.add("Who has won the most Oscars for acting?");*/
		Collections.shuffle(questions);
		String q = questions.get(0);
		questions.remove(0);
		return q;
		
	}
	//returns the string answer based on what question is asked
	public String getAnswer(String s) {
		if (s.equals("scissors : cut :: pen : ___ ?")) {
			return "write";
		} else if (s.equals("What is 5 * 9 + 6 * 2 / 3? (don't write the number as a word)")) {
			return "49";
		} else if (s.equals("   1   \n"
				+ " 1 2 1 \n"
				+ "1 3 3 1\n"
				+ "What's the next line? (Don't include spaces)")) {
			return "14641";
		} else if (s.equals("What is the only letter in scrabble that is worth 5 points?")) {
			return "k";
		} else if (s.equals("What’s the most malleable metal?")) {
			return "gold";
		} else if (s.equals("What are moving left to right, right now?")) {
			return "my eyes";
		} else if (s.equals("What do you throw out when you want to use it, but take in \n"
				+ "when you don’t want to use it?")) {
			return "anchor";
		} else if (s.equals("Who is the Roman equivalent of the Greek God Ares?")) {
			return "Mars";
		} else if (s.equals("What English word has 3 consecutive double letters?")) {
			return "bookkeeper";
		} else if (s.equals("What is it that lives if it is fed, and dies if you give it a drink?")) {
			return "fire";
		} else if (s.equals("What is the tip of a shoelace called?")) {
			return "aglet";
		} else if (s.equals("Who has won the most Oscars for acting?")) {
			return "katharine hepburn";
		} else {
			return " ";
		}
		
	}
	
}
