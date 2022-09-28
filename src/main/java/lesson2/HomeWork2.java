package lesson2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println();
        boolean ok = resul(10, 11);
        System.out.println(ok);
        System.out.println();
        posOrNeg(5);
        System.out.println();
        boolean yes = posAndNeg(-5);
        System.out.println(yes);
        System.out.println();
        manyTime("Строка", 6);
    }

    public static boolean resul(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void posOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean posAndNeg(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
   public static void manyTime (String word, int time) {
        for (int i = 1; i <= time; i++) {
            System.out.println(word);}
   }
}