import java.util.Scanner;

public class palindromes {
    public static void main(String args[]){
        String x , y = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check for palindromes: ");
        x = sc.nextLine();
        int i = x.length();

        for (int k = 1 ; k <= 0 ; k-- ) {
            y = y + x.charAt(k);
        }
        if (x.equalsIgnoreCase(y)){
            System.out.println("the string is palindromes.");
        } else {
            System.out.println("the string is not palindromes.");
        }
    }
}
