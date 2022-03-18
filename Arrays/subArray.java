import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Scanner sc = new Scanner(System.in);

    int len = sc.nextInt();
    int arr[] = new int[len];

    for(int i=0;i<len;i++)
      arr[i] = sc.nextInt();

    subArray(arr);
    
  }

  public static void subArray(int arr[])
  {
      int len = arr.length;
      for(int i=0;i<len;i++)
      {
        for(int k=i;k<len;k++)
        {
            for(int j=i;j<=k;j++)
            {
            System.out.print(arr[j]+"\t");
            }
            System.out.println();
        }
        
      }
  }
}
