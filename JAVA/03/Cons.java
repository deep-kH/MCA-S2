class A {
    int x, y;

    A(int a, int b){
        x = a;
        y = b;
    }

    void display()
    {
        System.out.println("x: " + x + ", y: " + y);
    }
}

class B extends A{
    int z;
    B(int a, int b, int c)
    {
        super(a, b);
        
    }
    void display(){
        System.out.println("This is derived class display function");
    }
}
class Cons{
    public static void main(String[] args) {
        B b = new B(6,   7, 9);
        b.display();
    }
}