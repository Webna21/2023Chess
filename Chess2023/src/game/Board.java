package game;

import enums.*;
import pieces.*;

public class Board {
	private Tile[][] tileArray;
	
	public Board() {
		tileArray = new Tile[8][8];
		
		int BoardSquareCounter = 0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				tileArray[7-j][i] = new Tile(BoardSquare.values()[BoardSquareCounter]);
				BoardSquareCounter++;
			}
		}
		setStartPosition();
	}
	
	public Board(boolean b) {
		tileArray = new Tile[8][8];
		
		int BoardSquareCounter = 0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				tileArray[7-j][i] = new Tile(BoardSquare.values()[BoardSquareCounter]);
				BoardSquareCounter++;
			}
		}
	}
	
	public void placePiece(PieceType p, SideColor c, BoardSquare b) {
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				if(j.getBoardSquare().equals(b)) {
					switch(p) {
					case PAWN:
						j.setPiece(new Pawn(c));
						break;
					case KNIGHT:
						j.setPiece(new Knight(c));
						break;
					case BISHOP:
						j.setPiece(new Bishop(c));
						break;
					case ROOK:
						j.setPiece(new Rook(c));
						break;
					case QUEEN:
						j.setPiece(new Queen(c));
						break;
					case KING:
						j.setPiece(new King(c));
						break;
					default:
						j.setPiece(new Open());
					}
				}
			}
		}
	}
	
	public void clearBoard() {
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				j.setPiece(new Open());
			}
		}
	}
	
	public void setStartPosition() {
		setPawns();
		setKnights();
		setBishops();
		setRooks();
		setQueens();
		setKings();
	}
	
	public void setPawns() {
		for(int i=0; i<8; i++) {
			tileArray[1][i].setPiece(new Pawn(SideColor.BLACK));
			tileArray[6][i].setPiece(new Pawn(SideColor.WHITE));
		}
	}
	
	public void setKnights() {
		tileArray[0][1].setPiece(new Knight(SideColor.BLACK));
		tileArray[0][6].setPiece(new Knight(SideColor.BLACK));
		tileArray[7][1].setPiece(new Knight(SideColor.WHITE));
		tileArray[7][6].setPiece(new Knight(SideColor.WHITE));
	}
	
	public void setBishops() {
		tileArray[0][2].setPiece(new Bishop(SideColor.BLACK));
		tileArray[0][5].setPiece(new Bishop(SideColor.BLACK));
		tileArray[7][2].setPiece(new Bishop(SideColor.WHITE));
		tileArray[7][5].setPiece(new Bishop(SideColor.WHITE));
	}
	
	public void setRooks() {
		tileArray[0][0].setPiece(new Rook(SideColor.BLACK));
		tileArray[0][7].setPiece(new Rook(SideColor.BLACK));
		tileArray[7][0].setPiece(new Rook(SideColor.WHITE));
		tileArray[7][7].setPiece(new Rook(SideColor.WHITE));
	}
	
	public void setQueens() {
		tileArray[0][3].setPiece(new Queen(SideColor.BLACK));
		tileArray[7][3].setPiece(new Queen(SideColor.WHITE));
	}
	
	public void setKings() {
		tileArray[0][4].setPiece(new King(SideColor.BLACK));
		tileArray[7][4].setPiece(new King(SideColor.WHITE));
	}
	
	public Tile getTile(BoardSquare square) {
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				if(j.getBoardSquare().equals(square)) {
					return j;
				}
			}
		}
		throw new IllegalArgumentException("Invalid file and/or rank.");
	}
	
	public Tile getTile(char file, int rank) {
		BoardSquare search = BoardSquare.toBoardSquare(file, rank);
		return getTile(search);
	}
	
	public Tile getTile(String str) {
		if(str.length()!=2) throw new IllegalArgumentException("Expected 2 character coordinate.");
		return getTile(str.toLowerCase().charAt(0),str.charAt(1)-'0');
	}
	
	public void basicMovePieceTile(Tile a, Tile b) {
		b.setPiece(a.getPiece());
		a.setPiece(new Open());
		b.getPiece().incrementMoveCount();
	}
	
	public void basicMovePieceBS(BoardSquare a, BoardSquare b) {
		basicMovePieceTile(getTile(a),getTile(b));
	}
	
	public void basicMovePieceStr(String a, String b) {
		basicMovePieceBS(BoardSquare.toBoardSquare(a),BoardSquare.toBoardSquare(b));
	}
	
	public void basicMovePieceMove(Move a) {
		basicMovePieceBS(a.getStart(),a.getFinish());
	}
	
	public void rotateBoard90cw() {
		for(int i=0; i<8; i++) {
			for(int j=i; j<8; j++) {
				Tile temp = tileArray[i][j];
				tileArray[i][j] = tileArray[j][i];
				tileArray[j][i] = temp;
			}
		}
		
		
		for(int i=0; i<8; i++) {
			int low = 0;
			int high = 7;
			while(low<high) {
				Tile temp = tileArray[i][low];
				tileArray[i][low] = tileArray[i][high];
				tileArray[i][high] = temp;
				low++;
				high--;
			}
		}
	}
	
	public void rotateBoard90ccw() {
		rotateBoard180();
		rotateBoard90cw();
	}
	
	public void rotateBoard180() {
		rotateBoard90cw();
		rotateBoard90cw();
	}
	
	public void printBoard() {
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				System.out.print(j.toStringDB() + " ");
			}
			System.out.println();
		}
	}
	
	public void printDisplayBoard() {
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				System.out.print(j.toDisplayChar() + " ");
			}
			System.out.println();
		}
	}
	
	public void printDisplayBoardCoords() {
		int rankn = 8;
		for(Tile[] i: tileArray) {
			for(Tile j: i) {
				System.out.print(j.toDisplayChar() + " ");
			}
			System.out.print(rankn);
			rankn--;
			System.out.println();
		}
		for(char i = 'a'; i<='h'; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Board test = new Board();
		
		test.rotateBoard180();

		test.basicMovePieceStr("e2", "e4");
		
		test.printBoard();
		System.out.println();
		test.printDisplayBoard();
	}
}
