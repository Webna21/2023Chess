package pieces;

import enums.*;

public class Pawn extends AbstractPiece {
	
	public Pawn(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return 1;
	}
	
	public PieceType getPieceType() {
		return PieceType.PAWN;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'P' : 'p';
	}
	
	
	
}
