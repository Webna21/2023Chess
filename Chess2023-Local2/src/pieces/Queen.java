package pieces;

import enums.*;

public class Queen extends AbstractPiece {
	
	public Queen(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return 9;
	}
	
	public PieceType getPieceType() {
		return PieceType.QUEEN;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'Q' : 'q';
	}
	
	
	
}
