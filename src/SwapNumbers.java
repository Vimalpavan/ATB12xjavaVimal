public class SwapNumbers {
    public static void main(String[] args) {
        int a= 100;
        int b= 200;
        System.out.println("Swap of a and b before: a ="+a +", b ="+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap of a and b after: a ="+a +", b ="+ b);
    }
}
