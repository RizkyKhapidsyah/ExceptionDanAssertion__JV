public class NestedTryDenganMethod {
    public NestedTryDenganMethod() {

    }

    static void TryBeruntun(String[] args) {
        try {
            int A = Integer.parseInt(args[0]);
            int B = Integer.parseInt(args[1]);
            System.out.println(A / B);
        } catch (ArithmeticException O) {
            System.out.println("Divided by Zero. Error: " + O);
        }
    }

    public static void main(String[] args) {
        try {
            TryBeruntun(args);
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("2 Paramater Diperlukan: " + E);
        }
    }

}
