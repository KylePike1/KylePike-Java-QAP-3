public class shapeTest {
    public static void main(String[] args){
        shape S = new shape("Red", true);

        circle C = new circle(5.0);

        circle C1 = new circle(5.0,"blue",true);

        rectangle R = new rectangle(2.0,3.0);

        rectangle R1 = new rectangle(2.0,3.0,"green",false);

        square sq = new square(4.0);

        square sq1 = new square(4.0,"yellow",true);

        System.out.println(S.toString());

        System.out.println(C.toString());

        System.out.println(C.getArea() + " is Cs Area. " + C.getPerimeter() + " is Cs Perimeter");

        System.out.println(C1.toString());
        

        System.out.println(C1.getArea() + " is C1s Area. " + C1.getPerimeter() + " is C1s Perimeter");

        System.out.println(R.toString());

        System.out.println(R.getArea() + " is Rs Area. " + R.getPerimeter() + " is Rs Perimeter");

        System.out.println(R1.getArea() + " is R1s Area. " + R1.getPerimeter() + " is R1s Perimeter");

        

        System.out.println(R1.toString());

        System.out.println(("Area: " + R1.getArea() + " Perimeter: " + R1.getPerimeter()));
 
        System.out.println(sq.toString());

        System.out.println(sq.getArea() + sq.getPerimeter());

        System.out.println(sq1.toString());

        System.out.println(sq1.getArea() + sq1.getPerimeter());
    }
    
}
