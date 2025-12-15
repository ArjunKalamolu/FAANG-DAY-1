import java.util.Scanner;
public class Even_Or_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer Number");
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.println("The entered number : "+n+" is an Even Number..");
        }else{
             System.out.println("The entered number : "+n+" is an Odd Number..");
        }
        input.close();
    }
    
}
