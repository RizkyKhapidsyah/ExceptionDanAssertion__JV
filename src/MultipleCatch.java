public class MultipleCatch {
    public MultipleCatch() {

    }

    public static void main(String[] args) {
        try {
            int X = Integer.parseInt(args[0]);
            System.out.println(3 / X);
        } catch (ArithmeticException Error1) {
            System.out.println("Divisor was 0.");
        } catch (ArrayIndexOutOfBoundsException Error2) {
            System.out.println("Missing Argument");
        }

        System.out.println("After Exception");
    }
}
