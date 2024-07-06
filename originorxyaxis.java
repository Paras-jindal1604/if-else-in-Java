import java.util.*;
public class originorxyaxis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the two co-ordinates : ");

        int x = scn.nextInt();
        int y = scn.nextInt();

        if(x == 0  &&  y == 0){
            System.out.println(" the points lie on origin.");
        }else if(x == 0){
            System.out.println("points lie on y-axis.");
        }else if(y == 0){
            System.out.println("points lie on x-axis.");
        }else{
            System.out.println("criteria not matched.");
        }
    }
    
}
