import java.util.*;
public class threepointsonaline {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the six co-ordinates : ");
        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int x3 = scn.nextInt();
        int y1 = scn.nextInt();
        int y2 = scn.nextInt();
        int y3 = scn.nextInt();

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1 == m2){
            System.out.println(" points lie on a straight line ");
        }else{
            System.out.println("do not lie on a straight line");
        }
    }
    
}
