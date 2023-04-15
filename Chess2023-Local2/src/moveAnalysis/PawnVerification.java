package moveAnalysis;

import game.*;
import pieces.AbstractPiece;

public class PawnVerification {
	private Game game;
	private Board board;
	private Move move;
	private AbstractPiece pawn;
	
	private char startFile;
	private int startRank;
	private char endFile;
	private int endRank;
	
	public PawnVerification(Game g, Move m) {
		game = g;
		board = g.getBoard();
		move = m;
		pawn = board.getTile(m.getStart()).getPiece();
		
		startFile = board.getTile(m.getStart()).getFile();
		startRank = board.getTile(m.getStart()).getRank();
		endFile = board.getTile(m.getFinish()).getFile();
		endRank = board.getTile(m.getFinish()).getRank();
		
	}
	
	public boolean PawnVerify() {
		return initialPawnVerify();
	}
	
	public boolean initialPawnVerify() {
		int rankChange = Math.abs(startRank-endRank);
		int fileChange = Math.abs(startFile-endFile);
		
		
		return false;
	}
}
