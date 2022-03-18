import java.util.Scanner;

public class Main{

    public static int[] sumOfArray(int[] arr,int[] arr1)
    {
        int len1 = arr.length;
        int len2 = arr1.length;
        
        int len3 = len1 > len2 ? len1 : len2;
        int resultArray[] = new int[len3];
        
        len1--;
        len2--;
        len3--;
        
        int sum = 0, carry = 0 , digit = 0;
        while(len1 >= 0 || len2 >= 0)
        {
            int val1 = len1 >= 0 ? arr[len1] : 0;
            int val2 = len2 >= 0 ? arr1[len2]: 0;
            
            sum = val1 + val2 + carry;
            
            digit = sum%10;
            carry = sum/10;
            resultArray[len3] = digit;
            len1--;
            len2--;
            len3--;
        }
        if(carry != 0)
        {
            len3 = resultArray.length + 1;
            int result[] = new int[len3];
            len3--;
            while(len3 > 0)
            {
                result[len3] = resultArray[len3-1];
                len3--;
            }
            result[0] = carry;
            return result;
        }
        return resultArray;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    
        int len = sc.nextInt();
        int arr[] = new int[len];
    
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
         
        int len1 = sc.nextInt();
        int arr1[] = new int[len1];
    
        for(int i=0;i<len1;i++)
            arr1[i] = sc.nextInt();   
        
        int[] result = sumOfArray(arr,arr1);
        
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
}
