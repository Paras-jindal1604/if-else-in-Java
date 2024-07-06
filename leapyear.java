import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if((n%400 == 0) || ((n%4 == 0 )&&(n%100 != 0) )){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
    
}
