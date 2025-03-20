class newfile2 {
    public static void main(String[] args) {
        Asswin Aron = new Asswin(21, 10, 5);
        Aron.Volume();
    }
}

class Zoori {
    int l, b;

    Zoori(int x, int y) {
        l = x;
        b = y;
    }

    int Area() {
        System.out.println("Area of 2D Object is : " + l * b);
        return l * b;
    }
}

class Asswin extends Zoori {
    int h, area;

    Asswin(int z, int a, int b) {
        super(a, b);
        h = z;
        System.out.println(h);
    }

    void Volume() {
        System.out.println("Area of 3D Object is : " + super.Area() * h);
    }
}

/*
 * Here Super Act as a Method to call the parent class constructor.
 * Subcalss Constructor uses Super keyword as a method to invoke the parent
 * class constructor.
 * Super may only be used within a subclass constructor.
 * The call to super cklass constructor using super method must appear as the
 * first statement in the sbclass constructor.
 * The paramenters in the super call must match the order and tyoe of the
 * instance variable declared in the super class
 */