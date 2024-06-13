public class rectangle extends shape{
    protected double width = 1.0;
    protected double height = 1.0;
    //constructors

    public rectangle(){}
    public rectangle(String color, boolean filled){
        super(color, filled);
    }

    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    //gettters and setters
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth( double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }
    //string method
    public String toString(){
        return "Rectangle " + super.toString() + " Width = " + width + " Height = " + height;
    }
}
