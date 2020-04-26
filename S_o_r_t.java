// main driver class for sorting
// We are using merge Sort here
import java.util.Scanner;
public class S_o_r_t
{   
    
public static void merge(int a[],int start,int mid,int end)
{
    int p = start;
    int q = mid+1;
    int arr[];
    arr = new int[end-start+1];
    int k = 0;
    for(int i=start;i<=end;i++)
    {
        if(p>mid)
        {
            arr[k++] = a[q++];
        }
        else if(q>end)
        {
            arr[k++] = a[p++];
        }
        else if(a[p]<a[q])
        {
            arr[k++] = a[p++];
        }
        else
        {
            arr[k++] = a[q++];

        }

    }

    for(p = 0;p<k;p++)
    {
        a[start++] = arr[p];
    }
}

public static void merge_sort(int a[],int start,int end)
{
    if(start<end)
    {
        int mid = (start+end)/2;

        merge_sort(a,start,mid);

        merge_sort(a,mid+1,end);

        merge(a,start,mid,end);
    }
}

public static String Sort_The_Numbers(int arr[],int n)
   {
        //int arr[];
    //Scanner sc = new Scanner(System.in);

//    System.out.println("enter number of elements ");
  //  int n = sc.nextInt();

    //arr = new int[n];

    //for(int i=0;i<n;i++)
    //arr[i]=sc.nextInt();
    merge_sort(arr,0,n-1);

    String strlist="";
    for(int i=0;i<n;i++)
    {
    //System.out.println(arr[i]);
    strlist = strlist+" "+arr[i];
    }

    return strlist;
}

}
