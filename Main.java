import java.util.Scanner;

public class Main {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
    Easter easter = new Easter();

        easter.addAlgorithimValue(scanner.nextInt());
        System.out.println(easter.getAlgorthimValueByLetter('a'));
 }   
}
