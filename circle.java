public class circle extends shape{
    protected double radius;
    //constuructors

    public circle(){
        this.radius = 1.0;
    }
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    //getters and setters
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //get area method
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    //get perimeter method
    public double getPerimeter(){
        return 2 * (Math.PI * radius);
    }
    // make cirle a string
    public String toString(){
        return "Circle " + super.toString() + " Radius is " + radius;
    }
}