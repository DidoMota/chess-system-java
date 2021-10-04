 package boardGame;

public abstract class Piece {
	
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
	
	//methods
	public abstract boolean[][] possibleMoves();
	
	//esse m�todo concreto utiliza o m�todo abstrato, hook methods
	//s� � poss�vel o m�todo ser concreto, pq ele chama uma implementa��o concreta de uma classe abstrata
	public boolean possibleMove(Position position) {						
		return possibleMoves()[position.getRow()][position.getColumn()]; 
	}
	
	// o m�todo verifica se h� alguma possibilidade de movimento da pe�a, verifica se a pe�a n�o est� travada
	// implanta��o que depende de um m�todo abstrato, hook methods
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