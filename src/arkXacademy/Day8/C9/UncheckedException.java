package arkXacademy.Day8.C9;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {

            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
