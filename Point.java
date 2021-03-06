
public class Point implements Cloneable {

    /**
     * The coordinate of this point.
     */
    private int x;
    private int y;

    /**
     * Constructor 
     * 
     * @param x
     *            the x coordinate
     * @param y
     *            the y coordinate
     */
    public Point(int x, int y){
        reset(x,y);
    }

 /**
     * Constructor 
     * 
     * @param p
     *            the Point to clone
     */
    public Point(Point p){
        reset(p.getX(),p.getY());
    }
    /**
     * Getter method for the attribute x.
     * 
     * @return the value of the attribute x
     */
    public int getX(){
        return x;
    }
    
    /**
     * Getter method for the attribute y.
     * 
     * @return the value of the attribute y
     */
    public int getY(){
        return y;
    }
    
    /**
     * Setter for x and y.
     * @param x
     *            the x coordinate
     * @param y
     *            the y coordinate
     */
    public void reset(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Point clone() throws CloneNotSupportedException{
     Point cloned=(Point)super.clone();
     cloned.reset(cloned.getX(), cloned.getY());
     return cloned;
    }

 }
