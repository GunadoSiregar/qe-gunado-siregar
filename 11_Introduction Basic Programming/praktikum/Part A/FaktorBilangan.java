import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        int bilangan;

        // Your Code Here
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        bilangan = input.nextInt();
        System.out.println("Output: ");

        for(int i=1; i<=bilangan; i++){
            if(bilangan%i == 0){
                System.out.println(i);
            }
        }
    }
    
}
