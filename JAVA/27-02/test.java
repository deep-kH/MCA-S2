
class test {
    int a;
    int b;

    test(int x, int y) {
        a = x;
        b = y;
    }

    boolean equals(test ob) {
        if (ob.a == a && ob.b == b) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String [] args){
        test objTest = new test(10, 20);
        test objTest2 = new test(10, 20);
        test obTest3 = new test(1, 3);
        System.out.println("O1 == O2 is " + objTest.equals(objTest2) +"( " +objTest.a+" == "+ objTest2.a+" AND " + objTest.b+" == "+objTest2.b+" )");
        System.out.println(String.format("Ob1 == Ob2 is %b (%d ne %d and %d ne %d)", objTest.equals(obTest3), objTest.a,
                obTest3.a, objTest.b, obTest3.b));
    }
}
