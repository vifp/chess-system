package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Não precisa colocar, mas é pra eu lembrar;
    }

    protected Board getBoard() { // Tabuleiro não pode ser acessível pela camada do jogo
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        // Procura na matriz pelo menos uma posição verdadeira para movimento.
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
