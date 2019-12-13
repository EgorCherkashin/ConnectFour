import java.util.List;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Win{
    
    public List<Point2D> findPoints(int x, int y){
        List<Point2D> positions = new ArrayList<Point2D>(); 
        if(x+3 <= 6){
            Point2D p = new Point2D.Double(x+3, y);
            positions.add(p);
        }
        if(x+3 <= 6 && y+3 <= 5){
            Point2D p = new Point2D.Double(x+3, y+3);
            positions.add(p);
        }
        if(x+3 <= 6 && y-3 >= 0){
            Point2D p = new Point2D.Double(x+3, y-3);
            positions.add(p);
        }
        if(x-3 >= 0){
            Point2D p = new Point2D.Double(x-3, y);
            positions.add(p);
        }
        if(x-3 >= 0 && y-3 >= 0){
            Point2D p = new Point2D.Double(x-3, y-3);
            positions.add(p);
        }
        if(x-3 >= 0 && y+3 <= 5){
            Point2D p = new Point2D.Double(x+3, y+3);
            positions.add(p);
        }
        if(y+3 <= 5){
            Point2D p = new Point2D.Double(x, y+3);
            positions.add(p);
        }
        if(y-3 >= 0){
            Point2D p = new Point2D.Double(x, y-3);
            positions.add(p);
        }
        return positions;
    }
    // List<Point2D> connectedPoints = new ArrayList<>();

    // public List<Point2D> connectedPoints(Gameboard board, int x, int y){
        
    // }

    public List<Point2D> pointsAround(int x, int y){
        List<Point2D> pos = new ArrayList<Point2D>(); 
        if(x-1 >= 0 && y+1 <= 5){
            Point2D p = new Point2D.Double(x-1,y+1);
            pos.add(p);
        }
        if(x-1 >= 0){
            Point2D p = new Point2D.Double(x-1,y);
            pos.add(p);
        }
        if(x-1 >= 0 && y-1 >= 0){
            Point2D p = new Point2D.Double(x-1,y-1);
            pos.add(p);
        }
        if(y-1 >= 0){
            Point2D p = new Point2D.Double(x,y-1);
            pos.add(p);
        } 
        if(x+1 <=6 && y-1 >= 0){
            Point2D p = new Point2D.Double(x+1,y-1);
            pos.add(p);
        } 
        if(x+1 <=6){
            Point2D p = new Point2D.Double(x+1,y);
            pos.add(p);
        }
        if(x+1 <=6 && y+1 <= 5){
            Point2D p = new Point2D.Double(x+1,y+1);
            pos.add(p);
        }
        if(y+1 <= 5){
            Point2D p = new Point2D.Double(x,y+1);
            pos.add(p);
        }
        return pos;
    }

}