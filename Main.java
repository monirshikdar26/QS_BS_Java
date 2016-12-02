import java.util.Scanner;
import java.util.Arrays;
public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);
QuickSort qs = new QuickSort();
BinarySearch bs = new BinarySearch();

System.out.print("Enter the length of array: ");
int length = input.nextInt();

int []A = new int[length];

System.out.println("Enter the element of array: ");
for(int i=0;i<length;i++)
A[i] = input.nextInt();

int start = 0;
int end = length-1;

qs.quickSort(A,start,end);

System.out.println(Arrays.toString(A));

bs.binarySearch(A,start,end);

}
}
