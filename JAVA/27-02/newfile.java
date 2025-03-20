public class newfile {
    public static void main(String args[]) {
        Kitten cat1 = new Kitten();
        cat1.ColorDisplay();
    }
}

class Cat {
    String Color = "black";
}

class Kitten extends Cat {
    String Color = "Red";

    void ColorDisplay() {
        System.out.println("My color is " + Color);
        System.out.println("Moms Color is " + super.Color);
    }
}

/*
 * Super as a referance variable used to refer the immediate parent class object
 * Whenever an instance of a subclass is created, an instance iof parent class
   is created implicitely It is refered by super keyword.
 */