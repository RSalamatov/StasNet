import java.util.Arrays;

public class java3 {
    public static void main(String[] args) {
//        int[][] myOps =
//                {{0,1,0},
//                {0,0,1}};
//        sumOfPositiveElements(myOps);
        int[][] arrayMy =
                {{1, 2, 3},
                        {2, 6, 8},
                        {1, -6, 13}};
        int[][] sumArr =
                {{1, 2, 3},
                        {2, 6, 8},
                        {1, -6, 13}};
//        char[][] arrSq = new char[8][8];
//        fill2DArray(arrSq, '.');
//        printDiagonal(arrSq);
//        printArr(arrSq);
//        printSquare(10);
//        findMax(arrayMy);
        sumTwoRow(sumArr);
    }

    private static void printDiagonal(char[][] arrSq) {
        for (int i = 0; i < arrSq.length; i++) {
            for (int j = arrSq.length; j > 0; j--) {
                arrSq[i][i] = '0';
                arrSq[i][arrSq.length - 1 - i] = '0';
            }
        }
    }


    private static void fill2DArray(char[][] arrSq, char symbol) {
        for (int i = 0; i < arrSq.length; i++) {
            for (int j = 0; j < arrSq[i].length; j++) {
                arrSq[i][j] = symbol;

            }
        }
    }

    public static void printArr(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int sumOfPositiveElements(int[][] ops) {
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            for (int j = 0; j < ops[i].length; j++) {
                if (ops[i][j] > 0) {
                    sum += ops[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int sumTwoRow(int[][] mas) {
        int sum = 0;

        for (int j = 0; j < mas[1].length; j++) {
            sum += mas[1][j];

        }

        System.out.println("сумма второй строки:" + sum);
        return sum;
    }
}
