import java.util.Scanner;

class Matrix {
    int a, b, array[][];

    Matrix(int a, int b) {
        this.a = a;
        this.b = b;
        this.array = new int[a][b];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("array[%d][%d] : ", i, j);
                this.array[i][j] = sc.nextInt();
                System.out.println();
            }
        }
    }

    static void addition(Matrix arr1, Matrix arr2) {
        if (arr1.a != arr2.a || arr1.b != arr2.b) {
            System.out.println("The both matrix should be equal size!!");
            return;
        } else {
            System.out.println("The addition of the two matrix is: ");
            for (int i = 0; i < arr1.a; i++) {
                for (int j = 0; j < arr2.b; j++) {
                    System.out.print(arr1.array[i][j] + arr2.array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static void multiplication(Matrix arr1, Matrix arr2){
        if ( arr1.b != arr2.a){
            System.out.println("The number of columns in first array should be equal to number of rows in second array!!");
            return;
        }
        else{
            for (int i = 0; i<arr1.a; i++){
                for (int j = 0; j<arr1.b; j++){
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean is_running = true;
        Scanner sc = new Scanner(System.in);
        while (is_running) {
            System.out.print("1. Addition\n2. Multiplication\n3. Transpose\n4. Exit\n Enter Your Choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the size of the first array(a b): ");
                    Matrix arr1 = new Matrix(sc.nextInt(), sc.nextInt());
                    System.out.print("Enter the size of the second array(a b): ");
                    Matrix arr2 = new Matrix(sc.nextInt(), sc.nextInt());
                    Matrix.addition(arr1, arr2);
                    break;
                case 2:
                    System.out.print("Enter the size of the first array(a b): ");
                    Matrix arr1 = new Matrix(sc.nextInt(), sc.nextInt());
                    System.out.print("Enter the size of the second array(a b): ");
                    Matrix arr2 = new Matrix(sc.nextInt(), sc.nextInt());
                    Matrix.multiplication(arr1, arr2);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    is_running = false;
                    break;
                default:
                    System.out.println("!! Wrong Choice !!");
                    break;
            }
        }

    }
}
