package дз;

public abstract class HW3 {

    public static void main(String[] args) {
//     array100();
//        arraysX2();
//        squareArr();
//        zeroOneArr();
//        lenInitialValue(22, 5);
//       miniMaxArr();;
//        sumLeftAndRight(new int[]{2, 4, 1, 2, 1, 8});
    }

    private static void zeroOneArr() {  //#1

        final int ARRAY_SIZE = 7;

        int[] data = new int[ARRAY_SIZE];
        data[0] = 1;
        data[2] = 1;
        data[1] = 1;
        data[data.length - 1] = 1;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            int x = data[i];
            x = (x == 0) ? 1 : 0;
            System.out.print(x + " ");
        }
    }


    private static void array100() {  //#2

        int[] arr = new int[100];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }


    private static void arraysX2() {  //#3

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 12; i++) {
            int x = arr2[i];
            x = (x < 6) ? x * 2 : x;
            System.out.print(x + " ");
        }
    }


    private static void squareArr() {  //#4

        int[][] square = new int[8][8];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                int y = square[i][j];
                if (i == j) {
                    y = 1;
                } else if (i + j == 7) {
                    y = 1;
                }
                System.out.printf("%2s ", y);
            }
            System.out.println();
        }
    }


    private static int lenInitialValue(Integer len, Integer initialValue) {  //#5

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(initialValue);
        }
        return arr[len];
    }


    private static void miniMaxArr() {  //#6

        int[] array = {1, 6, 12, 24, 5, 12, 222, 19, 2, 0, 1};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        System.out.println(max);

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) min = array[i];
        }

        System.out.println(min);
    }


    private static boolean sumLeftAndRight(int[] arr) {  //#7

        int summArr = 0;
        int leftCount = 0;

        for (int i = 0; i < arr.length; i++) {
            summArr += arr[i];
        }

        for (int i = 0; i != summArr; i++) {
            leftCount += arr[i];
            if (summArr - leftCount == summArr / 2) return true;
        }
        return false;
    }
}











