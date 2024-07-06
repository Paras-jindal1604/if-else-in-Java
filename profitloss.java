import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = scn.nextInt();
        System.out.println("Enter selling price : ");
        int sp = scn.nextInt();

        int profit = (sp-cp);
        int loss = (cp-sp);

        if(sp>cp){
            System.out.println(" Profit = " + profit);
        }else{
            System.out.println("loss " + loss);
        }
    }
    
}
