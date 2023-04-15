package pieces;

import enums.*;

public class King extends AbstractPiece {
	
	public King(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return Integer.MAX_VALUE;
	}
	
	public PieceType getPieceType() {
		return PieceType.KING;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'K' : 'k';
	}
	
	
	
}
