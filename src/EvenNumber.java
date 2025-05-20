import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner =new  Scanner(System.in) ;
        System.out.println("Even numbers from 1 to 100");
        int number = scanner.nextInt();
          for(int i=2;i<number; i++){
          if (i % 2== 0) {
              System.out.println(i);
          }
}
}
}