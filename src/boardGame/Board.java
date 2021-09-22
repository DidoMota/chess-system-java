package boardGame;

public class Board {
	
	private int row;
	private int column;
	private Piece[][] pieces;
	
	
	//constructors
	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}


	//getters and setters
	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int column) {
		this.column = column;
	}

	
	
}
