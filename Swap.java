import java.util.Scanner;
public class Swap {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for swapping :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("before swapping m = " +m+ " n = " +n);
        int temp = m;
        m=n;
        n=temp;
        temp=m;
        System.out.println("after swapping m = " +m+ " n = " +n);

        
    }
    
}
