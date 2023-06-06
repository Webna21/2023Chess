package moveAnalysis;

import game.*;
import pieces.AbstractPiece;

public class QueenVerification {
	private Game game;
	private Board board;
	private Move move;
	private AbstractPiece queen;
	
	private char startFile;
	private int startRank;
	private char endFile;
	private int endRank;
	
	public QueenVerification(Game g, Move m) {
		game = g;
		board = g.getBoard();
		move = m;
		queen = board.getTile(m.getStart()).getPiece();
		
		startFile = board.getTile(m.getStart()).getFile();
		startRank = board.getTile(m.getStart()).getRank();
		endFile = board.getTile(m.getFinish()).getFile();
		endRank = board.getTile(m.getFinish()).getRank();
		
	}
	
	public boolean QueenVerify() {
		return initialQueenVerify();
	}
	
	public boolean initialQueenVerify() {
		new RookVerification(game,move);
		new BishopVerification(game,move);
		return new RookVerification(game,move).RookVerify() || new BishopVerification(game,move).BishopVerify();
	}
}
