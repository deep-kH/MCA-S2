class parent {
    int a;
    int b;

    parent(int x, int y) {
        a = x;
        b = y;
    }

    int sum() {
        return a + b;
    }
}

class child extends parent {
    int x;

    child(int z, int y) {
        super(z, y);
        x = sum();
    }
}

class inherit {
    public static void main(String args[]) {
        child childob = new child(5, 10);
        System.out.println(childob.x);
    }
}
