package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;		

	
	//constructors
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//getters and setters
	public Color getColor() {
		return color;
	}

	
	//methods
	
	

}


/*
 * N�o h� inten��o de uma cor de uma pe�a ser modificada, por isso n�o h� o setColor();
*/
