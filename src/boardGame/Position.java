package boardGame;

public class Position {
	
	private int row;
	private int column;
	
	
	//constructors
	public Position() {		
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	
	//getter and setters
	public void setRow(int row) {
		this.row = row;		
	}
	
	public int getRow() {
		return row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getColumn() {
		return column;
	}
	
	
	//methods
	public void setValues(int row, int columns){		
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
