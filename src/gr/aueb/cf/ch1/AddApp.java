package gr.aueb.cf.ch1;

/**
 * Add two integers
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα των " + num1 + " , " + num2 + " είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d , %d είναι %d",num1,num2,result);
    }

    /**
     * Adds two int.
     *
     * @param a     the first int.
     * @param b     the second int.
     * @return      the sum of a. b.
     *
     * @deprecated
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
