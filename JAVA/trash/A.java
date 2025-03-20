public class A {
        static int C;

        static void count() {
            C++;
        }

        static void display() {
            System.out.println(C);
        }
    
    public static void main(String[] args){
        A.C = 0;
        A.display();
        A.count();
        A.display();
        A.count();
        A.display();
        A.count();
        A.display();
    }
}