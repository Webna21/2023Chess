package pieces;

import enums.*;

public abstract class AbstractPiece {
	
	private SideColor sideColor;
	private int moveCount;
	
	public AbstractPiece(SideColor color) {
		sideColor = color;
		moveCount = 0;
	}
	
	public SideColor getSideColor() {
		return sideColor;
	}

	public int getMoveCount() {
		return moveCount;
	}
	
	public void incrementMoveCount() {
		moveCount++;
	}
	
	public boolean hasMoved() {
		return moveCount != 0;
	}
	
	public abstract int getPieceValue();
	public abstract PieceType getPieceType();
	public abstract char toDisplayChar();
	
}
