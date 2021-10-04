package boardGame;


// essa classe representa o tabuleiro
public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	//constructors
	public Board(int rows, int columns) {
		if(rows <= 0 || columns <=0 ) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 colum");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	//getters and setters
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	
	//methods
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
	private boolean positionExists(int row, int colunm) {		// m�todo auxiliar do positionExists
		return row >=0 && row < rows && colunm >=0 && colunm < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	
}
