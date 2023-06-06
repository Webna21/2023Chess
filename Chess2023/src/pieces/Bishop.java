package pieces;

import enums.*;

public class Bishop extends AbstractPiece {
	
	public Bishop(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return 3;
	}
	
	public PieceType getPieceType() {
		return PieceType.BISHOP;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'B' : 'b';
	}
	
	
	
}
