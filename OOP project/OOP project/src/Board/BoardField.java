package Board;

public class BoardField {
    private char[][] grid;
    private int rows;
    private int cols;

    public BoardField(int rows, int cols) {
        this.grid = new char[rows][cols];
        this.rows = rows;
        this.cols = cols;

        initializeBoard();
    }
    //initialising the board
    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = '.';
            }
        }
        addWalls();
    }
        //adding a wall function
    private void addWalls(){
        for (int i = 0; i < rows; i++){
            grid[i][0] = '#';
            grid[i][cols - 1] = '#';
        }
        for (int j = 0; j<cols; j++){
            grid[0][j] = '#';
            grid[rows - 1][j] = '#';;
        }

        }
        //checking if is possible to walk on the board cell
     public boolean isWalkable(int row, int col){
        return grid[row][col] != '#';
    }
    //this function returns the cell symbol
    public char getCell(int rows, int cols){
        return grid[rows][cols];

    }
    //this function puts a symbol to the board
    public void setCell(int row, int col, char symbol){
        grid[row][col] = symbol;
    }
    //printing the board
    public String getBoardAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< rows; i++){
            for (int j = 0; j<cols; j++){
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
