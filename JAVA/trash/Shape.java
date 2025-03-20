import java.util.Scanner;

public class Shape {
    void findarea(double r) {
        System.out.println("The area of circle is: " + (r * r * 3.14));
    }

    void findarea(int l) {
        System.out.println("The area of square is: " + (l * l));
    }

    void findarea(int l, int b) {
        System.out.println("The area of rectangle is: " + (l * b));
    }

    void findarea(double b, double h) {
        System.out.println("The area of triangle is: " + (0.5 * b * h));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");
        double radius = sc.nextDouble();

        System.out.println("Enter the length of square:");
        int side = sc.nextInt();

        System.out.println("Enter the length and breadth of the rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter the breadth and height of the triangle:");
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("Enter the radius:");
        System.out.println("Enter the radius:");
        Shape s = new Shape();
        
        s.findarea(radius);
        s.findarea(side);
        s.findarea(l, b);
        s.findarea(breadth, height);
    }
}
