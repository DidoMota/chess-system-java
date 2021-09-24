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
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	
	//methods
	public void setValues(int row, int column){	
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {		//imprime uma posição na tela
		return row + ", " + column;
	}
	
}
// Essa classe representa uma posição no tabuleiro