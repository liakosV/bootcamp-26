public class test {
    public static void main(String[] args) {
        int year = 2026;

        if (year % 4 == 0) {
            System.out.println("is leap");
        } else {
            System.out.println("Is not leap");
        }

        int number1 = 13;
        int number2 = 12;
        int number3 = 3;

        int temp = 0;

        if (number1 > number2) {
            temp = number1;
        } else {
            temp = number2;
        }

        if (temp < number3) {
            temp = number3;
        }

        System.out.println(temp);
    }
}
