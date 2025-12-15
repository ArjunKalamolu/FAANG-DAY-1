import java.util.Scanner;
public class Sum_Of_N_Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you Target Number....");
        int n = input.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of N Natural Numbers till Target is :"+ sum);
        input.close();
    }
    
}
