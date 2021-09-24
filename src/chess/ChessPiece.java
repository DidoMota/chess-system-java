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
 * Não há intenção de uma cor de uma peça ser modificada, por isso não há o setColor();
*/
