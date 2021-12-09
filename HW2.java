public class HW2 {
    public static void main(String[] args) {
hTest();
    }


    public static boolean predel (int x, int y) { //1
        int z = x + y;
        if (z >= 10 && z <= 20) {
            System.out.println("Повезло");
            return true;
        } else {
            System.out.println("Не повезло");
            return false;
        }
    }


    public static void isPosOrNeg (int x) { //2
        if (x >= 0) {
            System.out.println("Позитив");
        } else {
            System.out.println("негатив");
        }
    }


    public static boolean isNegOrPos (int x) { //3
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void stringAndSu (String x, int y) { //4
        for (int z = 0; z < y; z++) {
            System.out.println(x);
        }
    }


    public static boolean hTest() { //*5
        int x = 16; //високосный
        if (x % 4 == 0 && x != 100 && x != 200 && x !=300 && x !=400)
            for (x = 4; x <= 400; ++x) {
                System.out.println("Високосный");
                return true;
            } else {
            System.out.println("нет");
        }
        return false;
    }
}

