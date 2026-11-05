public class test {

    
    public static  void hi(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        // int year = 2026;

        // if (year % 4 == 0) {
        //     System.out.println("is leap");
        // } else {
        //     System.out.println("Is not leap");
        // // }

        // for (int i = 10; i >= 0; i-- ) {
        //     System.out.println(i);
        // }

    //     int number1 = 13;
    //     int number2 = 12;
    //     int number3 = 3;

    //     int temp = 0;

    //     if (number1 >= number2) {
    //         temp = number1;
    //     } else {
    //         temp = number2;
    //     }

    //     if (temp <= number3) {
    //         temp = number3;
    //     }

    //     System.out.println(temp);

        // String name = "johhny";
        // hi("john");

        int[] values = new int[] {2, 4, 5, 6, 7, 10};

        System.out.println("Regular order:");
        for(int v = 0; v < values.length; v++) {
            System.out.println(values[v]);
            v++;
        }


        System.out.println("Reverse Order:");
        for(int v = values.length -1; v > 0; v--) {
            System.out.println(values[v]);
            v--;
        }

        
    }

    public static boolean find(int[] array, int key) {
        int start = 0;
        int stop = array.length - 1;
        int midpoint = (start + stop) / 2;

        if (start == key) {
            return true;
        }
        
        if (stop == key) {
            return true;
        }
        
        if (array[start] > key) {
            return false;
        }

        if (array[stop] < key) {
            return false;
        }

        while (array[midpoint] != key) {
            if (array[midpoint] > key ) {
                stop = midpoint;
            } else {
                start = midpoint;
            }

            midpoint = (start + stop) / 2;

            if (midpoint == start || midpoint == stop) {
                return false;
            }
        }

        return true;
    } 

}
