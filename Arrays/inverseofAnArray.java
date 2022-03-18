import java.util.Scanner;

public class Main{
    
    public static int[] inverseOfArray(int[] arr)
    {
        int resultArray[] = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            // for(int j=0;j<arr.length;j++)
            // {
            //     if(i == arr[j])
            //         resultArray[i] = j;
            // }
            int val = arr[i];
            resultArray[val] = i;
        }
        return resultArray;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
     
        int result[] = inverseOfArray(arr);
        for(int i=0;i<len;i++)
            System.out.print(result[i]+" ");
        
    }

}
