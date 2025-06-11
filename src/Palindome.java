import java.util.Scanner;

public class Palindome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        String reversed = "";
        for (int i = input.length()-1 ; i>=0; i--){
            reversed =reversed + input.charAt(i);
        }
            if(input.equals(reversed)){
                System.out.println(input + " is  palindome");
            }
            else {
                System.out.println(input + " is not palindome");
            }
    }
}