public class NestedTry {
    public NestedTry() {

    }

    public static void main(String[] args) {
        try {
            int A = Integer.parseInt(args[0]);
            try {
                int B = Integer.parseInt(args[1]);
                System.out.println(A / B);
            } catch (ArithmeticException RizkyKhapidsyah) {
                System.out.println("Divided by Zero. Error: " + RizkyKhapidsyah);
            }
        } catch (ArrayIndexOutOfBoundsException DessyPuspitaSari) {
            System.out.println("2 Parameter are Required!. Error: " + DessyPuspitaSari);
        }
    }
}
