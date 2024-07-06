import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int n = scn.nextInt();

        if(n%2 == 0){
            System.out.println(n + " is even.");
        } else{
            System.out.println(n + " is odd. ");
        }
    }
    
}
