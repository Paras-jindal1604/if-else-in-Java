import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a>b && a>c){
            System.out.println(a+ " is largest");
        }else if(b>a && b>c){
            System.out.println(b + " is largest");
        }else{
            System.out.println(c+ " is largest");
        }

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("valid triangle");
        }else{
            System.out.println("invalid triangle");
        }
    }
}
