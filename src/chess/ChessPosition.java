package chess;

import boardGame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	//constructors
	public ChessPosition(char column, int row) {	
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	
	//getters and setters
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//methods
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
		/*
		 * Observe que na linha: 8-8 = 0, 8-7=1, assim por diante
		 * Oberve que na coluna: 'a'-'a' = 0, 'b'-'a' = 1, 'c'-'a' = 2 assim por diante
		 */
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;		//esse string vazio "" for?a o compilador a entender que ? uma concatena??o de String;
	}
}
