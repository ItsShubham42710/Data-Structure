import java.util.Scanner;

public class Main {

  public static void reverse(int arr[])
  {
    int size = arr.length;
    int temp = 0;
    for(int i=0;i<size/2;i++)
    {
      temp = arr[i];
      arr[i] = arr[size-i-1];
      arr[size-i-1] = temp;
    }

  }
  public static void main(String[] args) {
    // Write your code here
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int arr[]= new int[size];

    for(int i=0;i<size;i++)
      arr[i] = sc.nextInt();

    reverse(arr);
    for(int i=0;i<size;i++)
      System.out.print(arr[i]+" ");
  }
}
