import java.util.Scanner;

class Matrix {
    int a, b, array[][];

    Matrix(int a, int b, Scanner sc) {
        this.a = a;
        this.b = b;
        this.array = new int[a][b];
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

    static void multiplication(Matrix arr1, Matrix arr2) {
        if (arr1.b != arr2.a) {
            System.out.println(
                    "The number of columns in first array should be equal to number of rows in second array!!");
            return;
        } else {
            for (int i = 0; i < arr1.a; i++) {
                for (int j = 0; j < arr2.b; j++) {
                    int sum = 0;
                    for (int k = 0; k < arr1.b; k++) {
                        sum += arr1.array[i][k] * arr2.array[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }

    static void transpose(Matrix x) {
        System.out.println("The original array is: ");
        for (int i = 0; i < x.a; i++) {
            for (int j = 0; j < x.b; j++) {
                System.out.print(x.array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Its transpose is: ");
        for (int i = 0; i < x.b; i++) {
            for (int j = 0; j < x.a; j++) {
                System.out.print(x.array[j][i] + " ");
            }
            System.out.println();
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
                    Matrix add1 = new Matrix(sc.nextInt(), sc.nextInt(), sc);
                    System.out.print("Enter the size of the second array(a b): ");
                    Matrix add2 = new Matrix(sc.nextInt(), sc.nextInt(), sc);
                    Matrix.addition(add1, add2);
                    break;
                case 2:
                    System.out.print("Enter the size of the first array(a b): ");
                    Matrix mul1 = new Matrix(sc.nextInt(), sc.nextInt(), sc);
                    System.out.print("Enter the size of the second array(a b): ");
                    Matrix mul2 = new Matrix(sc.nextInt(), sc.nextInt(), sc);
                    Matrix.multiplication(mul1, mul2);
                    break;
                case 3:
                    System.out.print("Enter the size of the array(a b): ");
                    Matrix transpose = new Matrix(sc.nextInt(), sc.nextInt(), sc);
                    Matrix.transpose(transpose);
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
