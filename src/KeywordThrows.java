class ThrowingClass {
    static void MethodSaya() throws ClassNotFoundException {
        throw new ClassNotFoundException("Hanya Percobaan!");
    }
}

public class KeywordThrows {
    public KeywordThrows() {

    }

    public static void main(String[] args) {
        try {
            ThrowingClass.MethodSaya();
        } catch (ClassNotFoundException Errorr) {
            System.out.println("Pesan Error: " + Errorr);
        }
    }

}
