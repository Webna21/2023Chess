package moveAnalysis;

import game.Board;
import game.Game;
import game.Move;
import pieces.AbstractPiece;

public class KnightVerification {
	private Game game;
	private Board board;
	private Move move;
	private AbstractPiece knight;
	
	private char startFile;
	private int startRank;
	private char endFile;
	private int endRank;
	
	public KnightVerification(Game g, Move m) {
		game = g;
		board = g.getBoard();
		move = m;
		knight = board.getTile(m.getStart()).getPiece();
		
		startFile = board.getTile(m.getStart()).getFile();
		startRank = board.getTile(m.getStart()).getRank();
		endFile = board.getTile(m.getFinish()).getFile();
		endRank = board.getTile(m.getFinish()).getRank();
		
	}
	
	public boolean KnightVerify() {
		return initialKnightVerify();
	}
	
	public boolean initialKnightVerify() {
		int rankChange = Math.abs(startRank-endRank);
		int fileChange = Math.abs(startFile-endFile);
		return (rankChange == 1 && fileChange == 2) || (rankChange == 2 && fileChange == 1);
	}
}
