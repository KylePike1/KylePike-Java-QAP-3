public class point {
    private float x = 0.0f;
    private float y = 0.0f;
    //constructors

    public point(){}

    public point(float x, float y){
        this.x = x;
        this.y = y;
    }
    //gettters and setters
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getXY(){
        return x + y;
    }
    //string method
    public String toString(){
        return "("+x+","+y+")";
    }

    
}
