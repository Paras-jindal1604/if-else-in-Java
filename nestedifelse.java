import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n%5 == 0 || n%3 == 0){
            if(n%15 != 0){
                System.out.println(" divisible by 3 or 5 but not by 15");
            }else{
                System.out.println("not fulfill criteria");
            }
          
        }else{
            System.out.println(" not divisible by 3 and 5 ");
        }
    }
}
