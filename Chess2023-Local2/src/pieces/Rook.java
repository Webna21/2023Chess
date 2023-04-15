package pieces;

import enums.*;

public class Rook extends AbstractPiece {
	
	public Rook(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return 5;
	}
	
	public PieceType getPieceType() {
		return PieceType.ROOK;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'R' : 'r';
	}
	
	
	
}
