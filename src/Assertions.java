public class Assertions {
    public Assertions() {

    }

    public static void main(String[] args) {
        int Umur = Integer.parseInt(args[0]);
        assert (Umur > 0);

        if (Umur >= 18) {
            System.out.println("Selamat! Kamu Sudah Dewasa");
        }
    }
}
