import java.util.Scanner;

/*
Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it.
If the two numbers are equal return a or b.
Note: a and b are not ordered!

Examples:
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        GetSum(a,b);
    }

    public static int GetSum(int a, int b){
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b ; i++){
                sum += i;
            }
            System.out.println(sum);
            return sum;
        } else if (a > b) {
            for (int i = b; i <= a; i++){
                sum += i;
            }
            System.out.println(sum);
            return sum;
        }
        else {
            System.out.println(a);
            //System.out.println(b);
            return a;
            //return b;
        }
    }
}
