//Shape class
public class shape {
    protected String color = "Green";
    protected boolean filled = true;

    //No Argument Constructor
    public shape(){
    }
    //Constructor with variables

    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //Getters and Setters
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean getFILLED(){
        return filled;
    }
    public String toString(){
        if (filled == true){
            return "A Shape of color " + color + " Which is filled";
        }else 
        return "A Shape of color " + color + " Which is not filled"; 

    
    }

    public static void main(String[] args){
        shape test = new shape();
        System.out.println(test.getColor());
    }
}
