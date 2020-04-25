public class KeywordThrow {
    public KeywordThrow() {

    }

    public static void main(String[] args) {
        String Input = "Invalid Input!";

        try {
            if (Input.equals("Invalid Input!")) {
                throw new RuntimeException("Throw Demo");
            } else {
                System.out.println(Input);
            }

            System.out.println();
        } catch (RuntimeException Error) {
            System.out.println("Pesan Error :");
            System.out.println(Error);
        }
    }
}
