package game;

import enums.*;

public class Move {
	private BoardSquare start;
	private BoardSquare finish;
	private double moveNumber;
	
	public Move(String a, String b, double num) {
		start = BoardSquare.toBoardSquare(a);
		finish = BoardSquare.toBoardSquare(b);
		moveNumber = num;
	}
	
	public Move(String a, String b) {
		start = BoardSquare.toBoardSquare(a);
		finish = BoardSquare.toBoardSquare(b);
		moveNumber = -1;
	}
	
	public BoardSquare getStart() {
		return start;
	}
	
	public BoardSquare getFinish() {
		return finish;
	}
	
	public double getMoveNumber() {
		return moveNumber;
	}
	
	public String toString() {
		return moveNumber + ". " + start.toString() + "-" + finish.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		Move a = new Move("a1","b2",5);
		System.out.println(a.toString());
	}
}
