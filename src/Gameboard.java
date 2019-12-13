public class Gameboard {
    private Spot[][] values;

    public Gameboard(){
        this.values = new Spot[7][6];
        initBoard();
        // placeSpot(1, 1, 1);
        // placeSpot(2, 2, 2);
        // placeSpot(2, 0, 4);
        printBoard();
    }
    
    private void initBoard(){
        for(int y = 0; y < 6; y++){
            for(int x = 0; x < 7; x++){
                this.values[x][y] = new Spot(0, x, y);
            }
        }
    }

    public void printBoard(){
        for(int y = 0; y < 6; y++){
            for(int x = 0; x < 7; x++){
                System.out.print(" | " + values[x][y].getPlayer());
                if(x == 6){
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
        System.out.println(" -----------------------------");
        System.out.println(" | 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
    }

    public void placeSpotTesting(int value, int x, int y){
        values[x][y].setValue(value);
    }
    
    public void placeSpot(int value, int column){
        int top = findPosition(column);
        values[column][top].setValue(value);
    }

    public int findPosition(int column){
        for(int i = 5; i > 0; i--){
            if(values[column][i].getPlayer() == 0){
                return i;
            }
        }
        return 0;
    } 

    public boolean checkColumn(int c){
        if(c > 6 || c < 0){
            System.out.println("Invalid Input");
            return false;
        }
        for(int i = 0; i < 6; i++){
            // System.out.println(values[c][i].getPlayer());
            if(values[c][i].getPlayer() == 0){
                return true;
            }
        }
        System.out.println("Column is full");
        return false;
    }
}