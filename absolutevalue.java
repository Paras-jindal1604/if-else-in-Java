import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any integer :");
        int n = scn.nextInt();

        if(n<0){
            n = n* (-1);
            System.out.println(" Absolute value is " +n);
        }else{
            System.out.println("absolute value is " + n);
        }
    }
    
}
