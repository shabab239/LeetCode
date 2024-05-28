import java.util.LinkedList;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String[] array = String.valueOf(x).split("");
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        return String.valueOf(x).equals(sb.toString());
    }

}
