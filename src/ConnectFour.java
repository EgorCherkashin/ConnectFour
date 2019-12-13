import java.util.List;
import java.awt.geom.Point2D;

public class ConnectFour{
    private int curplayer = 1;
    public ConnectFour(){
        Gameboard board = new Gameboard();
        while(true){
            playRound(board, this.curplayer);
            this.curplayer = changePlayer(curplayer);
            board.printBoard();
        }
    }

    private int changePlayer(int currentPlayer){
        if(currentPlayer == 1){
            return 2;
        } else {
            return 1;
        }
    }

    public static void playRound(Gameboard board, int curplayer) {
        Win win = new Win();
        int colselection = columnSelection(board);
        System.out.println("Choose: " + colselection);
        board.placeSpot(curplayer, colselection);
        List<Point2D> pos = win.findPoints(colselection, board.findPosition(colselection)+1);
        List<Point2D> pos2 = win.pointsAround(colselection, board.findPosition(colselection)+1);
        System.out.println(pos2);
        // ArrayList<Integer> list = win.pointsRange(colselection, curplayer);
        // System.out.println(list);
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