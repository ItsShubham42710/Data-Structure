import java.util.Scanner;

public class Main{
    public static int maxElement(int[] arr)
    {
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void barStructureRepresentationofArray(int[] arr)
    {
        int temp = maxElement(arr);
        int max = temp;
        for(int i = 0; i < max ;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(temp == arr[j])
                {
                    arr[j] -= 1;
                    System.out.print("*\t");
                } 
                else
                    System.out.print("\t");
            }
            System.out.println("");
            temp--;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int arr[] = new int[len];
        
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
                
        barStructureRepresentationofArray(arr);
    }

}
