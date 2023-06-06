package enums;

public enum BoardSquare {
	a1,a2,a3,a4,a5,a6,a7,a8,
	b1,b2,b3,b4,b5,b6,b7,b8,
	c1,c2,c3,c4,c5,c6,c7,c8,
	d1,d2,d3,d4,d5,d6,d7,d8,
	e1,e2,e3,e4,e5,e6,e7,e8,
	f1,f2,f3,f4,f5,f6,f7,f8,
	g1,g2,g3,g4,g5,g6,g7,g8,
	h1,h2,h3,h4,h5,h6,h7,h8;
	
	public static BoardSquare toBoardSquare(char file, int rank) {
		String coordinate = Character.toString(file).toLowerCase() + Integer.toString(rank);
		for(BoardSquare x: BoardSquare.values()) {
			if(coordinate.equals(x.toString())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid file and/or rank.");
	}
	
	public static BoardSquare toBoardSquare(String str) {
		if(str.length()!=2) throw new IllegalArgumentException("Expected 2 character coordinate.");
		return toBoardSquare(str.charAt(0),str.charAt(1)-'0');
	}
	
	public static char getFile(BoardSquare square) {
		return square.toString().charAt(0);
	}
	
	public static int getRank(BoardSquare square) {
		return square.toString().charAt(1)-'0';
	}
	
	
	
	public static void main(String[] args) {
		int a = getRank(BoardSquare.a1);
		System.out.println(a);
	}
}