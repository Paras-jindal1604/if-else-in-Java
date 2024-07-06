import java.util.Scanner;
public class areaofrect {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = scn.nextInt();
        System.out.println("Enter breadth : ");
        int b = scn.nextInt();

        int p = 2*(l+b);
        int a = l*b;

        if(p == a){
            System.out.println("Square");
        }else{
            System.out.println("Rectangle");
        }

        if(p>a){
            System.out.println(" Perimeter is greater than area. ");
        }else if(p == a){
            System.out.println(" Area is equal to perimeter. ");
        } else{
            System.out.println("Area is greater than perimeter");
        }
    }
    
}
