package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Não precisa colocar, mas é pra eu lembrar;
    }

    protected Board getBoard() { // Tabuleiro não pode ser acessível pela camada do jogo
        return board;
    }
}
