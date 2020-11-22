import java.util.Scanner;

public class snake_print {
    static void print(int n)
    {
    int i=1;
        for(int j=1;j<=n;j++)
        {
            if(j%2!=0)
            {
                do
                {
                    System.out.print(i+" ");
                    i++;
                }  while((i-1)%n!=0);
                i--;
            }
            else
            {
                i = i+n;
                do
                {
                    System.out.print(i+" ");
                    i--;
                }  while(i%n!=0);
                i=i+n;
                i++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        print(n);

    }
}
