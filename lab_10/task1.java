class Area{
    void Area(int side1, int side2) {
        System.out.println("Rectangle Area: " + side1*side2);
    }
    void Area(int radius) {
        System.out.println("Circle Area: " + (3.1415*radius*radius));
    }
}
public class task1 {
    public static void main(String args[]) {
        Area areaObj = new Area();
        areaObj.Area(4);
        areaObj.Area(5,6);

    }
}
