class Base {
    Base ()
    {
        System.out.println("This is base default constructor");

    }

    void display()
    {
        System.out.println("This is base display function");
    }
}

class Child extends Base{
    int x;

    Child()
    {
        System.out.println("This is child default constructor");

    }

    void display(int m)
    {
        x = m;
        System.out.println(x);
    }


    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.display(5);
    }
}