import java.util.Scanner;

public class Main{
    public static void reverseArray(int[] arr,int sp,int ep)
    {
        int temp = 0;
        while(sp < ep)
        {
            temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
    public static int[] rotateArray(int[] arr,int key)
    {
        //Total Number of Rotaion
        key = key % arr.length;
        
        //for negative key
        if(key < 0)
            key = key + arr.length;
        
        //rotate part-1
        int sp = 0;
        int ep = arr.length-key-1;
        reverseArray(arr,sp,ep);
        
        //rotate part-2
        sp = arr.length-key;
        ep = arr.length-1;
        reverseArray(arr,sp,ep);
        
        //rotate whole array
        sp = 0;
        ep = arr.length-1;
        reverseArray(arr,sp,ep);
        
        return arr;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
        
        int key = sc.nextInt();
        
        int[] result = rotateArray(arr,key);
        
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }

}
