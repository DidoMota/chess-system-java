 package boardGame;

public abstract class Piece {
	
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
	
	//methods
	public abstract boolean[][] possibleMoves();
	
	//esse método concreto utiliza o método abstrato, hook methods
	//só é possível o método ser concreto, pq ele chama uma implementação concreta de uma classe abstrata
	public boolean possibleMove(Position position) {						
		return possibleMoves()[position.getRow()][position.getColumn()]; 
	}
	
	// o método verifica se há alguma possibilidade de movimento da peça, verifica se a peça não está travada
	// implantação que depende de um método abstrato, hook methods
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}

//