import java.util.*;

public class Main {
    
    //Power function
    public static int pow(int x, int y) {
        int base = 1;
        for (int i = 1; i <=y; i++) {
            base = base * x;
        }

        return base ;
    }
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        //To store answer
        int inv = 0;
        //original position of digit from rigth
        int op = 1;
        while (num != 0) {
            //Extract digit(right) from number
            int od = num % 10;
            //make inverted digit as original position
            int id = op;
            //make inverted position as original digit
            int ip = od;
            //add result to inv.
            inv += id * pow(10, ip - 1);
            num /= 10;
            op++;

        }
        System.out.println(inv);
    }
}