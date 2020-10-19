package boardgame;

public class Board {
    private int rows;
    private  int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Piece piece(int row, int columns){
        return pieces[row][columns];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
