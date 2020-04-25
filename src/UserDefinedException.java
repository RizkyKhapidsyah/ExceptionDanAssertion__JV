class HSE extends RuntimeException {

}

public class UserDefinedException {
    public UserDefinedException() {

    }

    public static void main(String[] args) {
        String Masukan = "Invalid Input!";

        try {
            if (Masukan.equals("Invalid Inputs!")) {
                throw new HSE();
            }

            System.out.println("String Accepted!");
        } catch (HSE Error1) {
            System.out.println("Saya Tidak Menyukai String ini: " + Masukan + ".");
        }
    }
}
