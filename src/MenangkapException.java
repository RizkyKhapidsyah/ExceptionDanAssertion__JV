public class MenangkapException {
    public MenangkapException() {

    }

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
            System.out.println("Please print me!");
        } catch (ArithmeticException PesanError) {
            System.out.println("Error: " + PesanError);
        }

        System.out.println("After exception");
    }
}
