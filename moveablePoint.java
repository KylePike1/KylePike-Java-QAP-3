public class moveablePoint extends point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    //constructors

    public moveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public moveablePoint(){}

    public moveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //getters and setters

    public float getXSpeed(){
        return xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float y){
        this.ySpeed = y;
    }
    public void setXSpeed(float x){
        this.xSpeed = x;
    }
    public void setSpeed(float x, float y){
        this.xSpeed = x;
        this.ySpeed = y;
    }
    public String getSpeed(){
        return "X Speed: " + xSpeed + " Y Speed: " + ySpeed;
    }
    //String method
    public String toString(){
        return "("+getX()+","+getY()+"), Speed: (" + xSpeed + "," + ySpeed + ")";
    }
    //method to move the point
    public void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    
}
