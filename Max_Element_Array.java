import java.util.Scanner;
import java.util.Arrays;
public class Max_Element_Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The resultant Array is = "+Arrays.toString(arr));
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Element in the array is : "+max);
        input.close();
    }
}
