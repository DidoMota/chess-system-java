package chess;

import boardGame.Board;

public class ChessMatch {
	
	//*Essa clase será o coração do jogo de xadrez, onde terá as regras
	
	private Board board;		//toda partida de xadrez precisa de um board
	
	//constructors
	public ChessMatch() {		
		board = new Board(8,8);
	}
	
	
	//methods
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
		for(int i=0; i<board.getRow(); i++) {
			for(int j=0; j<board.getColumn(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
