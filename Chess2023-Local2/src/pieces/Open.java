package pieces;

import enums.*;

public class Open extends AbstractPiece {
	
	public Open() {
		super(SideColor.OPEN);
	}

	public int getPieceValue() {
		return 0;
	}
	
	public PieceType getPieceType() {
		return PieceType.OPEN;
	}

	public char toDisplayChar() {
		return '-';
	}
	
	
	
}
