package moveAnalysis;

import game.*;
import pieces.AbstractPiece;

public class BishopVerification {
	private Game game;
	private Board board;
	private Move move;
	private AbstractPiece bishop;
	
	private char startFile;
	private int startRank;
	private char endFile;
	private int endRank;
	
	public BishopVerification(Game g, Move m) {
		game = g;
		board = g.getBoard();
		move = m;
		bishop = board.getTile(m.getStart()).getPiece();
		
		startFile = board.getTile(m.getStart()).getFile();
		startRank = board.getTile(m.getStart()).getRank();
		endFile = board.getTile(m.getFinish()).getFile();
		endRank = board.getTile(m.getFinish()).getRank();
		
	}
	
	public boolean BishopVerify() {
		return initialBishopVerify();
	}
	
	public boolean initialBishopVerify() {
		int rankChange = Math.abs(startRank-endRank);
		int fileChange = Math.abs(startFile-endFile);
		if(rankChange!=fileChange) return false;
		if(startFile<endFile) {
			if(startRank<endRank) {
				for(int i=1; i<rankChange; i++) {
//					System.out.println(board.getTile((char)(startFile+i),startRank+i).toStringDB());
					if(board.getTile((char)(startFile+i),startRank+i).hasPiece()) {
						return false;
					}
				}
			} else {
				for(int i=1; i<rankChange; i++) {
//					System.out.println(board.getTile((char)(startFile+i),startRank-i).toStringDB());
					if(board.getTile((char)(startFile+i),startRank-i).hasPiece()) {
						return false;
					}
				}
			}
		} else {
			if(startRank<endRank) {
				for(int i=1; i<rankChange; i++) {
//					System.out.println(board.getTile((char)(startFile-i),startRank+i).toStringDB());
					if(board.getTile((char)(startFile-i),startRank+i).hasPiece()) {
						return false;
					}
				}
			} else {
				for(int i=1; i<rankChange; i++) {
//					System.out.println(board.getTile((char)(startFile-i),startRank-i).toStringDB());
					if(board.getTile((char)(startFile-i),startRank-i).hasPiece()) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
