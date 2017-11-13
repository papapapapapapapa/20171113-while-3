import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int counter=1;
        int sum=1;
        while (n<0)
            n=in.nextInt();
        while (counter<=n)
        {
            sum*=counter;
            counter++;
        }
        System.out.print(sum);
    }
}
