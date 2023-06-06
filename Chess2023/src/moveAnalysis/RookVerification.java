package moveAnalysis;

import game.*;
import pieces.AbstractPiece;

public class RookVerification {
	private Game game;
	private Board board;
	private Move move;
	private AbstractPiece rook;
	
	private char startFile;
	private int startRank;
	private char endFile;
	private int endRank;
	
	public RookVerification(Game g, Move m) {
		game = g;
		board = g.getBoard();
		move = m;
		rook = board.getTile(m.getStart()).getPiece();
		
		startFile = board.getTile(m.getStart()).getFile();
		startRank = board.getTile(m.getStart()).getRank();
		endFile = board.getTile(m.getFinish()).getFile();
		endRank = board.getTile(m.getFinish()).getRank();
		
	}
	
	public boolean RookVerify() {
		return initialRookVerify();
	}
	
	public boolean initialRookVerify() {
		int rankChange = Math.abs(startRank-endRank);
		int fileChange = Math.abs(startFile-endFile);
		if(rankChange!=0 && fileChange!=0) return false;
		if(rankChange==0) {
			if(startFile<endFile) {
				startFile++;
				for(char i=startFile; i<endFile; i++) {
					if(board.getTile(i,startRank).hasPiece()) {
						return false;
					}
				}
			} else {
				endFile++;
				for(char i=endFile; i<startFile; i++) {
					if(board.getTile(i,startRank).hasPiece()) {
						return false;
					}
				}
			}
		} else {
			if(startRank<endRank) {
				for(int i=startRank+1; i<endRank; i++) {
					if(board.getTile(startFile,i).hasPiece()) {
						return false;
					}
				}
			} else {
				for(int i=endRank+1; i<startRank; i++) {
					if(board.getTile(startFile,i).hasPiece()) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
