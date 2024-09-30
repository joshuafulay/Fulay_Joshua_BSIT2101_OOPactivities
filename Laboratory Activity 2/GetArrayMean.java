import java.util.Scanner;
public class GetArrayMean{

public static void main(String[]args){
    Scanner scanner=new
    Scanner(System.in);

    System.out.print("Enter number of elements: ");
    int n=scanner.nextInt();
    int[]array=new int[n];
    int sum=0;

    for(int i=0; i<n; i++){
    System.out.print("Enter number: ");
   array[i]= scanner.nextInt();
   sum += array[i];
}

 double mean = (double)sum/n;

System.out.printf("Mean of array is: %.2f%n ", mean);

}
}
