package test;

import enums.*;
import game.*;

public class Test {
	public static void RookTest() {
		Game RTestGame = new Game(true);
		Board RTestBoard = RTestGame.getBoard();
		
		System.out.println("---Rook Free Movement Test---");
		RTestBoard.placePiece(PieceType.ROOK, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		RTestBoard.printDisplayBoard();
		System.out.println("Up Three");
		RTestGame.AdvancedMovePiece("e4", "e7");
		RTestBoard.printDisplayBoard();
		System.out.println("Down Three");
		RTestGame.AdvancedMovePiece("e7", "e4");
		RTestGame.AdvancedMovePiece("e4", "e1");
		RTestBoard.printDisplayBoard();
		System.out.println("Right Three");
		RTestGame.AdvancedMovePiece("e1", "e4");
		RTestGame.AdvancedMovePiece("e4", "h4");
		RTestBoard.printDisplayBoard();
		System.out.println("Left Three");
		RTestGame.AdvancedMovePiece("h4", "e4");
		RTestGame.AdvancedMovePiece("e4", "b4");
		RTestBoard.printDisplayBoard();
		
		System.out.println("---Rook Through Same Color Movement Test---");
		RTestGame.AdvancedMovePiece("b4", "e4");
		System.out.println("Starting Position");
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e5);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e3);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f4);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d4);
		RTestBoard.printDisplayBoard();
		System.out.println("Up Three");
		RTestGame.AdvancedMovePiece("e4", "e7");
		RTestBoard.printDisplayBoard();
		System.out.println("Down Three");
		RTestGame.AdvancedMovePiece("e4", "e1");
		RTestBoard.printDisplayBoard();
		System.out.println("Right Three");
		RTestGame.AdvancedMovePiece("e4", "h4");
		RTestBoard.printDisplayBoard();
		System.out.println("Left Three");
		RTestGame.AdvancedMovePiece("e4", "b4");
		RTestBoard.printDisplayBoard();

		System.out.println("---Rook Through Opposite Color Movement Test---");
		RTestGame.AdvancedMovePiece("b4", "e4");
		System.out.println("Starting Position");
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.e5);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.e3);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.f4);
		RTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.d4);
		RTestBoard.printDisplayBoard();
		System.out.println("Up Three");
		RTestGame.AdvancedMovePiece("e4", "e7");
		RTestBoard.printDisplayBoard();
		System.out.println("Down Three");
		RTestGame.AdvancedMovePiece("e4", "e1");
		RTestBoard.printDisplayBoard();
		System.out.println("Right Three");
		RTestGame.AdvancedMovePiece("e4", "h4");
		RTestBoard.printDisplayBoard();
		System.out.println("Left Three");
		RTestGame.AdvancedMovePiece("e4", "b4");
		RTestBoard.printDisplayBoard();

		System.out.println("---Rook Capture Opposite Color Test---");
		System.out.println("Starting Position");
		RTestBoard.printDisplayBoard();
		System.out.println("Capture Up One");
		RTestGame.AdvancedMovePiece("e4", "e5");
		RTestBoard.printDisplayBoard();
		System.out.println("---After Capture Artifact Test---");
		RTestGame.AdvancedMovePiece("e5", "e8");
		RTestBoard.printDisplayBoard();
		
		System.out.println("---Invalid Squares Test---");
		RTestBoard.clearBoard();
		RTestBoard.placePiece(PieceType.ROOK, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		RTestBoard.printDisplayBoard();
		System.out.println("e4 to a1");
		RTestGame.AdvancedMovePiece("e4", "a1");
		RTestBoard.printDisplayBoard();
		System.out.println("e4 to f5");
		RTestGame.AdvancedMovePiece("e4", "f5");
		RTestBoard.printDisplayBoard();
		System.out.println("e4 to d3");
		RTestGame.AdvancedMovePiece("e4", "d3");
		RTestBoard.printDisplayBoard();
		
	}
	
	public static void BishopTest() {
		Game BTestGame = new Game(true);
		Board BTestBoard = BTestGame.getBoard();
		
		System.out.println("---Bishop Free Movement Test---");
		BTestBoard.placePiece(PieceType.BISHOP, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		BTestBoard.printDisplayBoard();
		System.out.println("Diagonal Up Right One");
		BTestGame.AdvancedMovePiece("e4", "f5");
		BTestBoard.printDisplayBoard();
		System.out.println("Diagonal Down Left One");
		BTestGame.AdvancedMovePiece("f5", "e4");
		BTestGame.AdvancedMovePiece("e4", "d3");
		BTestBoard.printDisplayBoard();
		System.out.println("Diagonal Down Right One");
		BTestGame.AdvancedMovePiece("d3", "e4");
		BTestGame.AdvancedMovePiece("e4", "f3");
		BTestBoard.printDisplayBoard();
		System.out.println("Diagonal Up Left One");
		BTestGame.AdvancedMovePiece("f3", "e4");
		BTestGame.AdvancedMovePiece("e4", "d5");
		BTestBoard.printDisplayBoard();

		System.out.println("Diagonal Up Right Three");
		BTestGame.AdvancedMovePiece("d5", "e4");
		BTestGame.AdvancedMovePiece("e4", "h7");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Left Three");
		BTestGame.AdvancedMovePiece("h7", "e4");
		BTestGame.AdvancedMovePiece("e4", "b1");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Right Three");
		BTestGame.AdvancedMovePiece("b1", "e4");
		BTestGame.AdvancedMovePiece("e4", "h1");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Left Three");
		BTestGame.AdvancedMovePiece("h1", "e4");
		BTestGame.AdvancedMovePiece("e4", "b7");
		BTestBoard.printDisplayBoard();
		
		System.out.println("---Bishop Through Same Color Movement Test---");
		System.out.println("Starting Position");
		BTestGame.AdvancedMovePiece("b7", "e4");
		BTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f5);
		BTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f3);
		BTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d5);
		BTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d3);
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Right Three");
		BTestGame.AdvancedMovePiece("d5", "e4");
		BTestGame.AdvancedMovePiece("e4", "h7");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Left Three");
		BTestGame.AdvancedMovePiece("h7", "e4");
		BTestGame.AdvancedMovePiece("e4", "b1");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Right Three");
		BTestGame.AdvancedMovePiece("b1", "e4");
		BTestGame.AdvancedMovePiece("e4", "h1");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Left Three");
		BTestGame.AdvancedMovePiece("h1", "e4");
		BTestGame.AdvancedMovePiece("e4", "b7");
		BTestBoard.printDisplayBoard();

		System.out.println("---Bishop Capture Opposite Color Test---");
		BTestBoard.clearBoard();
		BTestBoard.placePiece(PieceType.BISHOP, SideColor.WHITE, BoardSquare.e4);
		BTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.g6);
		System.out.println("Starting Position");
		BTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Right 2");
		BTestGame.AdvancedMovePiece("e4", "g6");
		BTestBoard.printDisplayBoard();

		System.out.println("Invalid Squares Test");
		BTestGame.AdvancedMovePiece("g6", "e4");
		BTestGame.AdvancedMovePiece("e4", "a1");
		BTestGame.AdvancedMovePiece("e4", "f4");

	}
	
	public static void QueenTest() {
		Game QTestGame = new Game(true);
		Board QTestBoard = QTestGame.getBoard();
		
		System.out.println("---Queen Free Movement Test---");
		QTestBoard.placePiece(PieceType.QUEEN, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Up Four");
		QTestGame.AdvancedMovePiece("e4", "e8");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Down Seven");
		QTestGame.AdvancedMovePiece("e8", "e1");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Right Three");
		QTestGame.AdvancedMovePiece("e1", "h1");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Six Left");
		QTestGame.AdvancedMovePiece("h1", "b1");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Right Five");
		QTestGame.AdvancedMovePiece("b1", "g6");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Left Four");
		QTestGame.AdvancedMovePiece("g6", "c2");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Left Two");
		QTestGame.AdvancedMovePiece("c2", "a4");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Down Left Three");
		QTestGame.AdvancedMovePiece("a4","d1");
		QTestBoard.printDisplayBoard();
		
		System.out.println("---Queen Through Same Color Movement Test---");
		System.out.println("Starting Position");
		QTestBoard.basicMovePieceStr("d1", "e4");	
		
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e5);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f4);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.f5);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d4);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.d5);
		
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Right Three");
		QTestGame.AdvancedMovePiece("e4", "h7");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Diagonal Up Right One");
		QTestGame.AdvancedMovePiece("e4", "f5");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Left Three");
		QTestGame.AdvancedMovePiece("e4", "b4");
		QTestBoard.printDisplayBoard();
		
		System.out.println("Up Four");
		QTestGame.AdvancedMovePiece("e4", "e8");
		QTestBoard.printDisplayBoard();

		System.out.println("---Queen Capture Opposite Color Test---");
		QTestBoard.clearBoard();
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.e5);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.e3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.f3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.f4);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.f5);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.d3);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.d4);
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.d5);
		QTestBoard.placePiece(PieceType.QUEEN, SideColor.WHITE, BoardSquare.e4);

		QTestGame.AdvancedMovePiece("e4", "e5");
		QTestBoard.printDisplayBoard();
		
		QTestGame.AdvancedMovePiece("e5", "d5");
		QTestBoard.printDisplayBoard();
		
		QTestGame.AdvancedMovePiece("d5", "f3");
		QTestBoard.printDisplayBoard();
		
		System.out.println("---Invalid Squares Test---");
		QTestBoard.clearBoard();
		QTestBoard.placePiece(PieceType.QUEEN, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		QTestBoard.printDisplayBoard();
		
		QTestGame.AdvancedMovePiece("e4", "d8");
		QTestGame.AdvancedMovePiece("e4", "f6");
		QTestGame.AdvancedMovePiece("e4", "h3");
		
		QTestBoard.printDisplayBoard();
		System.out.println("Through Opposite Pieces Test");
		QTestBoard.placePiece(PieceType.KNIGHT, SideColor.BLACK, BoardSquare.e5);
		QTestBoard.printDisplayBoard();

		QTestGame.AdvancedMovePiece("e4", "e6");
		QTestGame.AdvancedMovePiece("e4", "e8");
		QTestGame.AdvancedMovePiece("e4", "f4");
		QTestBoard.printDisplayBoard();
		QTestGame.AdvancedMovePiece("f4", "d6");
		QTestGame.AdvancedMovePiece("f4", "c7");

		QTestBoard.printDisplayBoard();
	}
	
	public static void KnightTest() {
		Game NTestGame = new Game(true);
		Board NTestBoard = NTestGame.getBoard();
		
		System.out.println("---Knight Free Movement Test---");
		NTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		NTestBoard.printDisplayBoard();
		
		System.out.println("Down Right");
		NTestGame.AdvancedMovePiece("e4", "f2");
		NTestBoard.printDisplayBoard();
		
		System.out.println("Up Right");
		NTestGame.AdvancedMovePiece("f2", "g4");
		NTestBoard.printDisplayBoard();
		
		System.out.println("Down Left");
		NTestGame.AdvancedMovePiece("g4", "e3");
		NTestBoard.printDisplayBoard();
		
		System.out.println("---Knight Opposite Capture Test---");
		System.out.println("Starting Position");
		NTestBoard.basicMovePieceStr("e3", "e4");

		NTestBoard.placePiece(PieceType.PAWN, SideColor.BLACK, BoardSquare.d6);
		NTestBoard.placePiece(PieceType.PAWN, SideColor.BLACK, BoardSquare.f7);
		NTestBoard.placePiece(PieceType.PAWN, SideColor.BLACK, BoardSquare.g5);
		NTestBoard.printDisplayBoard();
		System.out.println("One");
		NTestGame.AdvancedMovePiece("e4", "d6");
		NTestBoard.printDisplayBoard();
		System.out.println("Two");
		NTestGame.AdvancedMovePiece("d6", "f7");
		NTestBoard.printDisplayBoard();
		System.out.println("Three");
		NTestGame.AdvancedMovePiece("f7", "g5");
		NTestBoard.printDisplayBoard();
		
		System.out.println("---Invalid Squares Test---");
		NTestBoard.clearBoard();
		NTestBoard.placePiece(PieceType.KNIGHT, SideColor.WHITE, BoardSquare.e4);
		System.out.println("Starting Position");
		NTestBoard.printDisplayBoard();

		NTestGame.AdvancedMovePiece("e4", "a1");
		NTestGame.AdvancedMovePiece("e4", "e5");
		NTestGame.AdvancedMovePiece("e4", "f4");
		NTestGame.AdvancedMovePiece("e4", "h8");
		NTestGame.AdvancedMovePiece("e4", "d5");





	}
	public static void main(String[] args) {
		//RookTest(),BishopTest(),QueenTest(),KnightTest()
		RookTest();
		BishopTest();
		QueenTest();
		KnightTest();
	}
}
