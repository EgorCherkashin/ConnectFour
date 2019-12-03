
public class Spot{
    private int value;
    private int x;
    private int y;

    public Spot(int player, int posx, int posy){
        value = player;
        this.x = posx;
        this.y = posy;
    }

    public int getPlayer(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}