import java.util.Scanner;
public class threedigitno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n>99 && n<1000){
            System.out.println("three digit number");
        }else{
            System.out.println("not a three digit number");
        }
    }
}
