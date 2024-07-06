import java.util.Scanner;
public class marksgrade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks :");
        int n = scn.nextInt();

        if(n>90){
            System.out.println("Excellent");
        }else if(n>80){
            System.out.println(" Very Good");
        }else if(n>70){
            System.out.println("Good");
        }
        else if(n>60){
            System.out.println("Can do better");
        }
        else if(n>50){
            System.out.println("Average");
        }
        else if(n>40){
            System.out.println("Need to improve");
        }
        else if(n>30){
            System.out.println("Not good ");
        }

    }

}


// This is called  if-else-if  ladder.
