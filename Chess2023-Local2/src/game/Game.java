package game;

import java.util.*;

import enums.*;
import moveAnalysis.*;

public class Game {
	private Board gameBoard;
	private SideColor currentTurn;
	private double numMoves;
	private ArrayList<Move> scoreSheet;
	private GameState state;
	
	public Game() {
		gameBoard = new Board();
		currentTurn = SideColor.WHITE;
		numMoves = 0;
		scoreSheet = new ArrayList<>();
		state = GameState.ONGOING;
	}
	
	public Game(boolean b) {
		gameBoard = new Board(true);
		currentTurn = SideColor.WHITE;
		numMoves = 0;
		scoreSheet = new ArrayList<>();
		state = GameState.ONGOING;
	}
	
	public Board getBoard() {
		return gameBoard;
	}
	
	public SideColor getCurrentTurn() {
		return currentTurn;
	}
	
	public double getNumMoves() {
		return numMoves;
	}
	
	public void flipCurrentTurn() {
		if(state == GameState.ONGOING) currentTurn = currentTurn == SideColor.WHITE ? SideColor.BLACK : SideColor.WHITE;
	}
	
	public void incrementNumMoves() {
		numMoves++;
	}
	
	
	
	public void AdvancedMovePiece(String start, String finish) {
		//no piece on starting square
		if(gameBoard.getTile(start).hasPiece()==false) {
			System.out.println("No piece on starting square");
		} 
		//starting square piece is wrong color
//		else if(gameBoard.getTile(start).getPiece().getSideColor()!=currentTurn) {
//			System.out.println("Illegal move: Wrong SideColor on initial square.");
//		}
		//cannot capture own piece
		else if(gameBoard.getTile(finish).getPiece().getSideColor()==currentTurn) {	
			System.out.println("Illegal move: Cannot capture piece of own color.");
		} 
		//check legality
		else if(verifyMove(new Move(start, finish))) {
			if(currentTurn == SideColor.WHITE) incrementNumMoves();
//			flipCurrentTurn();
			Move latestMove;
			if(currentTurn == SideColor.BLACK) {
				latestMove = new Move(start, finish, numMoves);
			} else {
				latestMove = new Move(start, finish, (numMoves+0.5));
			}
			scoreSheet.add(latestMove);
			
			gameBoard.basicMovePieceMove(latestMove);
		} else {
			System.out.println("Illegal move: Catchall");
		}

	}
	
	public boolean verifyMove(Move m) {
		PieceType pieceType = getBoard().getTile(m.getStart()).getPiece().getPieceType();
		switch (pieceType) {
		case PAWN:
			return PawnVerification.PawnVerify(this,m);
		case KNIGHT:
			return new KnightVerification(this,m).KnightVerify();
		case BISHOP:
			return new BishopVerification(this,m).BishopVerify();
		case ROOK:
			return new RookVerification(this,m).RookVerify();
		case QUEEN:
			return new QueenVerification(this,m).QueenVerify();
		case KING:
			return KingVerification.KingVerify(this,m);
		default:
			return false;
		}
	}
	
	
	public void printScoreSheet() {
		System.out.println(scoreSheet.toString());
	}
	
	public void printGame() {
		gameBoard.printBoard();
	}
	
	public void printDisplayGame() {
		gameBoard.printDisplayBoard();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
