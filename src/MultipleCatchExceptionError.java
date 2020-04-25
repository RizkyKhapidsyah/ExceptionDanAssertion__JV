public class MultipleCatchExceptionError {
    public MultipleCatchExceptionError() {

    }

    public static void main(String[] args) {
        try {
            int A = Integer.parseInt(args[0]);
            int B = Integer.parseInt(args[1]);
            System.out.println(A / B);
        } catch (ArrayIndexOutOfBoundsException eRror2){
            System.out.println(eRror2);
        } catch (Exception eRror){
            System.out.println(eRror);
        }

        System.out.println("After Try-Catch-Catch");
    }
}
