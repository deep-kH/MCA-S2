final class Rect {
    final int x = 100;

    final void change()
    {
        x = 50;
    }

}

class Final extends Rect {

    void change()
    {
        x = 20;
    }

    public static void main(String[] args) {
        Rect r1 = new Rect();

        r1.change();
    }
}