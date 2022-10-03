// İstenilen basamak sayısına göre * işareti ile ters üçgen yapan program.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = (n - i -2); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2*i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}