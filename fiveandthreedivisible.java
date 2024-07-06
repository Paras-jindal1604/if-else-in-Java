import java.util.Scanner;

public class fiveandthreedivisible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n%5 == 0 && n%3 != 0){
            System.out.println("divisible by 5 and not by 3 ");
        }else{
            System.out.println(" divisible by 3 and 5 ");
        }
    }
}



// we should use (n % 15 == 0) because it will be divisible by 15 also