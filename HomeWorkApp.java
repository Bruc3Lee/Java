public class HomeWorkApp {
    public static void main(String[] args) {
printThreeWords();

    } static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");


    } static void checkSumSing() {
        int a = 1;
        int b = 10;
        int t = a + b;
        System.out.println("Сумма двух чисел = " + t);
        if(t >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    } static void printColor() {
        int value = 2;
        if(value <= 0) {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }


    } static void compareNumbers(){
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
