package maze2;

import java.util.ArrayList;

public class LabDesign {
	private boolean[][] _lab;
	private boolean[][] _lab2;
	private boolean[][] _lab3;
	private boolean[][] _lab4;
	private boolean[][] _lab5;
	public static final LabPosition end = new LabPosition(8, 10);
	private ArrayList<boolean[][]> list = new ArrayList<>();
	
	public LabPosition getQPos() {
		int x = (int) (Math.random() * 12);
		int[] row = {7, 3, 3, 1, 1, 6, 6, 9, 9, 3, 7, 5};
		int[] col = {5, 3, 7, 1, 9, 1, 9, 5, 9, 5, 7, 9};
		return new LabPosition(row[x], col[x]);
	}
	
	public LabDesign() {
		//true = wall
		//false = space
		boolean[][] lab = {{true, false, true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			   {true, false, true,  false, false, false, false, false, false, false, true},
		/*2*/			   {true, false, true,  true,  false, true,  false, true,  true,  true,  true},
		/*3*/			   {true, false, true,  false, false, true,  false, false, false, false, true},
		/*4*/			   {true, false, false, false, true,  true,  false, true,  true,  false, true},
		/*5*/			   {true, false, false, true,  true,  true,  true,  true,  true,  false, true},
		/*6*/			   {true, true,  false, true,  true,  false, false, false, false, false, true},
		/*7*/			   {true, false, false, false, true,  false, true,  true,  true,  true,  true},
		/*8*/			   {true, false, true,  false, true,  false, false, false, false, false, false},
		/*9*/			   {true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true}};
			_lab = lab;

		boolean[][] lab2 = {{true, false, true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			    {true, false, false, true,  false, false, false, false, false, false, true},
		/*2*/			    {true, true,  false, false, false, true,  false, true,  false, false, true},
		/*3*/			    {true, true,  true,  true,  true,  true,  false, true,  true,  false, true},
		/*4*/			    {true, false, false, false, false, true,  false, true,  false, false, true},
		/*5*/			    {true, false, true,  true,  true,  true,  false, true,  false, true,  true},
		/*6*/			    {true, false, false, false, false, false, false, true,  false, false, true},
		/*7*/			    {true, false, true,  true,  true,  true,  false, true,  true,  false, true},
		/*8*/			    {true, false, false, false, false, true,  false, true,  false, false, false},
		/*9*/			    {true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true}};
			_lab2 = lab2;
			
		boolean[][] lab3 = {{true, false, true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			    {true, false, false, false, false, false, true,  false, false, false, true},
		/*2*/			    {true, true,  true,  true,  true,  false, true,  false, true,  false, true},
		/*3*/			    {true, false, false, false, false, false, true,  false, true,  false, true},
		/*4*/			    {true, true,  true,  false, true,  true,  true,  false, true,  false, true},
		/*5*/			    {true, false, false, false, false, false, false, false, true,  false, true},
		/*6*/			    {true, false, true,  true,  true,  true,  true,  false, true,  false, true},
		/*7*/			    {true, false, false, false, false, true,  true,  false, true,  true,  true},
		/*8*/			    {true, false, true,  true,  false, true,  false, false, false, false, false},
		/*9*/			    {true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true}};
			_lab3 = lab3;

		boolean[][] lab4 = {{true, false,  true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			    {true, false, true,  false, false, false, false, false, false, false, true},
		/*2*/			    {true, false, true,  false, true,  false, true,  true,  true,  false, true},
		/*3*/			    {true, false, true,  false, true,  false, true,  false, false, false, true},
		/*4*/			    {true, false, true,  false, true,  false, true,  false, true,  true,  true},
		/*5*/			    {true, false, true,  false, true,  true,  true,  false, false, false, true},
		/*6*/			    {true, false, false, false, false, false, true,  false, true,  false, true},
		/*7*/			    {true, true,  true,  true,  true,  false, true,  false, true,  false, true},
		/*8*/			    {true, false, false, false, false, false, true,  false, true,  false, false},
		/*9*/			    {true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true}};
			_lab4 = lab4;
		boolean[][] lab5 = {{true, false, true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			    {true, false, false, true,  true,  false, false, false, false, false, true},
		/*2*/			    {true, true,  false, false, true,  true,  false, true,  false, true,  true},
		/*3*/			    {true, true,  true,  false, false, true,  false, true,  false, true,  true},
		/*4*/			    {true, false, true,  true,  false, true,  false, true,  false, false, true},
		/*5*/			    {true, false, true,  true,  false, true,  false, true,  true,  false, true},
		/*6*/			    {true, false, true,  false, false, true,  false, true,  false, false, true},
		/*7*/			    {true, false, false, false, true,  true,  false, true,  true,  false, true},
		/*8*/			    {true, true,  true,  false, false, false, false, false, true,  false, false},
		/*9*/			    {true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true}};
			_lab5 = lab5;
			
			list.add(_lab);
			list.add(_lab2);
			list.add(_lab3);
			list.add(_lab4);
			list.add(_lab5);
		}
	
	
	public boolean[][] getLab(int x) { return list.get(x); }
	
	public LabPosition getEnd() { return end; }
	
}
