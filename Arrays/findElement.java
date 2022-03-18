import java.util.Scanner;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int len = sc.nextInt();
    int arr[] = new int[len];

    int i=0,flag=0;
    for(i=0;i<len;i++)
        arr[i] = sc.nextInt();

    int val = sc.nextInt();
    for(i=0;i<len;i++)
    {
        if(arr[i] == val)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 1)
        System.out.print(i);
    else
        System.out.print(-1);
 }

}
