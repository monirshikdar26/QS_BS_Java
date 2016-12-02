public class QuickSort
{
public void quickSort(int []A,int start,int end)
{
if(start < end)
{
int pIndex = partition(A,start,end);
quickSort(A,start,pIndex-1);
quickSort(A,pIndex+1,end);
}
}

public int partition(int []A,int start,int end)
{
int pivot = A[end];
int pIndex = start;
for(int i=start;i<end;i++)
{
   if(A[i]<=pivot)
     {
	//swapIn(A[i],A[pIndex]);
	int tempIn = A[i];
	A[i] = A[pIndex];
	A[pIndex] = tempIn;
	pIndex = pIndex + 1;
     }
}
//swapOut(A[pIndex],A[end]);
int tempOut = A[pIndex];
A[pIndex] = A[end];
A[end] = tempOut;
return pIndex;
}
/*
public void swapIn(int A[i],int A[pIndex])
{
int temp = A[i];
A[i] = A[pIndex];
A[pIndex] = temp;
}

public void swapOut(int A[pIndex],int A[end])
{
int temp = A[pIndex];
A[pIndex] = A[end];
A[end] = temp;
}
*/
}
