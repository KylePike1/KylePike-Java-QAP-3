public class moveablePointTest {
    public static void main(String[] args){
        point p1 = new point(2.5f, 0.9f);
        moveablePoint mp1 = new moveablePoint(0.1f, 4f, 2f,39f);
        point p2 = new point(9f, 0.3f);
        moveablePoint mp2 = new moveablePoint(1f, 96f);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(mp1.toString());
        System.out.println(mp2.toString());
        p1.setXY(21f, 2f);
        mp2.getXSpeed();
        p2.getXY();
        mp1.move();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(mp1.toString());
        System.out.println(mp2.toString());





    }
    
}
