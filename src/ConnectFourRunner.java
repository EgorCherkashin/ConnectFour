public class ConnectFourRunner{
    public static void main(String[] args) {
        Gameboard board = new Gameboard();
        while(true){
            playRound(board);
            board.printBoard();
        }
    }

    public static void playRound(Gameboard board) {
        int colselection = columnSelection(board);
        System.out.println("Choose: " + colselection);
        board.placeSpot(1, colselection);
    }

    public static int columnSelection(Gameboard board){
        int choice = 0;
        do{
            System.out.print("Select column: ");
            choice = TextIO.getInt() - 1;
        } while (board.checkColumn(choice) == false);

        return choice;
        
    }
}