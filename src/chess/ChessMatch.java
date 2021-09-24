package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	//*Essa clase ser� o cora��o do jogo de xadrez, onde ter� as regras
	
	private Board board;		//toda partida de xadrez precisa de um board
	
	//constructors
	public ChessMatch() {		
		board = new Board(8,8);
		initialSetup();
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
	
	//montando o tabuleiro inicial testando 3 pe�as
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
}
