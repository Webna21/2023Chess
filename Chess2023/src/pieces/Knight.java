package pieces;

import enums.*;

public class Knight extends AbstractPiece {
	
	public Knight(SideColor side) {
		super(side);
	}

	public int getPieceValue() {
		return 3;
	}
	
	public PieceType getPieceType() {
		return PieceType.KNIGHT;
	}

	public char toDisplayChar() {
		return this.getSideColor() == SideColor.WHITE ? 'N' : 'n';
	}
	
	
	
}
