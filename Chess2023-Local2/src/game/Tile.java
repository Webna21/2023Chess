package game;

import enums.*;
import pieces.*;

public class Tile {
	
	private BoardSquare square;
	private AbstractPiece piece;
	
	
	
	public Tile(char file, int rank) {
		square = BoardSquare.toBoardSquare(file, rank);
		piece = new Open();
	}
	
	public Tile(BoardSquare square) {
		this.square = square;
		piece = new Open();
	}
	
	public BoardSquare getBoardSquare() {
		return square;
	}

	public char getFile() {
		return BoardSquare.getFile(square);
	}
	
	public int getRank() {
		return BoardSquare.getRank(square);
	}
	
	public AbstractPiece getPiece() {
		return piece;
	}
	
	public void setPiece(AbstractPiece piece) {
		this.piece = piece;
	}
	
	public boolean hasPiece() {
		return piece.getPieceType() != PieceType.OPEN;
	}
	
	public char toDisplayChar() {
		return piece.toDisplayChar();
	}
	
	public String toStringDB() {
		return piece.toDisplayChar() + square.toString();
	}
}
