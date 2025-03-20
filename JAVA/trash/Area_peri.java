public class Area_peri {
    int radius;
    int length;
    int breadth;
    int hieght;
    double area;

    Area_peri(int x) {
        radius = x;
        area = 3.14 * radius * radius;
    }

    Area_peri(int x, int y) {
        length = x;
        breadth = y;
        area = length * breadth;
    }

    Area_peri(int x, int y, int z) {
        length = x;
        breadth = y;
        hieght = z;
        area = length * breadth * hieght;
    }

    void calcArea() {
        System.out.println("The Area : "+area);
    }

    public static void main(String arg[]){
        Area_peri shape = new Area_peri(21);
        Area_peri shape1 = new Area_peri(21,9);
        Area_peri shape2 = new Area_peri(21,32,12);
        shape.calcArea();
        shape2.calcArea();
        shape1.calcArea();
    }
}
