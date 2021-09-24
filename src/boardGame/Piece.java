package boardGame;

public class Piece {
	
	protected Position position;		
	private Board board;
	
	
	//constructors	
	public Piece(Board board) {
		this.board = board;
		position = null;		//o position instancia como nulo porque uma pe�a rec�m criada n�o ter� posi��o ainda
	}

	
	//getters and setters
	protected Board getBoard() {
		return board;
	}
	
}
