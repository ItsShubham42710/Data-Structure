import java.util.Scanner;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int len = sc.nextInt();
    int arr[] = new int[len];

    for(int i=0;i<len;i++)
        arr[i] = sc.nextInt();

    int max= arr[0];
    int min= arr[0];

    for(int i=1;i<len;i++)
    {
        if(max<arr[i])
            max = arr[i]; 
    }

    for(int i=1;i<len;i++)
    {
       if(min>arr[i])
            min = arr[i];  
    }

    System.out.println(max-min);
     }

}
