public class square extends rectangle {
    //constructors
    public square(){}

    public square(double side){
        super(side,side);
    }
    public square(double side, String color, boolean filled){
        super(color, filled);
        this.width = side;
        this.height = side;
    }
    //getters and setters
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
        this.height = side;
    }
    public void setWidth(double side){
        this.width = side;
        this.height = side;
    }
    public void setLength(double side){
        this.width = side;
        this.height = side;
    }
    //string method
    public String toString(){
        return "Square " + super.toString() + " Side Length: " + width;
    }
    
}
