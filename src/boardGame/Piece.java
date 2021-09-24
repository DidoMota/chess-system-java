package boardGame;

public class Piece {
	
	protected Position position;		
	private Board board;
	
	
	//constructors	
	public Piece(Board board) {
		this.board = board;
		position = null;		//o position instancia como nulo porque uma peça recém criada não terá posição ainda
	}

	
	//getters and setters
	protected Board getBoard() {
		return board;
	}
	
}
