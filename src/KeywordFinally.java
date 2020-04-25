public class KeywordFinally {
    public KeywordFinally() {

    }

    static void MethodSaya(int N) throws Exception {
        try {
            switch (N) {
                case 1:
                    System.out.println("Case 1");
                case 3:
                    System.out.println("Case 3");
                    throw new RuntimeException("Case 3 Demo");
                case 4:
                    System.out.println("Case 4");
                    throw new Exception("Case 4 Demo");
                case 2:
                    System.out.println("Case 2");
            }
        } catch (RuntimeException Errror) {
            System.out.println("Exception Runtime Pesan :");
            System.out.println(Errror.getMessage());
        } finally {
            System.out.println("Try_Block is Entered!");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            try {
                KeywordFinally.MethodSaya(i);
            } catch (Exception Errrror) {
                System.out.println("Pesan Error: ");
                System.out.println(Errrror.getMessage());
            }

            System.out.println();
        }
    }
}
