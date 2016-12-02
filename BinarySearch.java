import java.util.Scanner;

public class BinarySearch
{
public void binarySearch(int []A,int start,int end)
{
Scanner s = new Scanner(System.in);
int mid= (start + end)/2;

System.out.print("Enter the searching value: ");
int search = s.nextInt();

while(start<end)
{
     if(search < A[mid])
 	  end = mid - 1;
	  else if(search == A[mid])
		{
		System.out.print("Searching element "+search+" is found at index "+mid);	
		break;
		}
     else
	 start= mid + 1;
mid=(start + end)/2;
}
if(start > end)
System.out.print("Searching element "+search+" not found");
}

}
