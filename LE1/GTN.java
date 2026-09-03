import java.util.Scanner;

public class GTN {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("Enter the two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1 > n2)
            System.out.println(n1 + " is greater than "+ n2);
        else if(n1 < n2)
            System.out.println(n2 + " is greater than "+ n1);
        else
            System.out.println(n1 + " and " + n2 + " equal");

        sc.close();
    }
}