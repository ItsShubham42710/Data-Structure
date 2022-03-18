import java.util.Scanner;

public class Main{

    public static int[] diffOfTwoArray(int[] arr1, int[] arr2)
    {
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        int len3 = len2;
        int resultArray[] = new int[len3];
        
        len1--;
        len2--;
        len3--;
        int diff = 0;
        while(len1 >= 0 || len2 >= 0)
        {
            int val1 = len1 >= 0 ? arr1[len1] : 0;
            int val2 = arr2[len2];
            
            diff = (val2-val1 >= 0) ? (val2-val1) : val2+10 - val1;
            
            if(val2 < val1 && len2 > 0)
            {
                arr2[len2-1] = len2 > 0 ? arr2[len2-1] -= 1 : arr2[len2-1];
                //arr1[len1-1] = len1 > 0 ? arr1[len1-1] += 1 : arr1[len1-1];
            }  
            
            resultArray[len3] = diff;
            len1--;
            len2--;
            len3--;
            
            if(arr2[0] == 0)
            {
                len3 = resultArray.length-1;
                int result[] = new int[len3];
                len3--;
                while(len3 >= 0)
                {
                    result[len3] = resultArray[len3+1];
                    len3--;
                }
                return result;
            }
        }
        return resultArray;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int len1 = sc.nextInt();
        int arr1[] = new int[len1];
        
        for(int i=0;i<len1;i++)
            arr1[i] = sc.nextInt();
                
        int len2 = sc.nextInt();
        int arr2[] = new int[len2];
        
        for(int i=0;i<len2;i++)
            arr2[i] = sc.nextInt();
            
        int[] result = diffOfTwoArray(arr1,arr2);
        
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }

}
