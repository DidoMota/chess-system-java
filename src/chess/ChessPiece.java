package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public abstract class ChessPiece extends Piece{
	
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
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	

}


/*
 * Não há intenção de uma cor de uma peça ser modificada, por isso não há o setColor();
*/
