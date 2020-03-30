import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            boolean flag = false;
            for (int j = 2; j * j <= n; j++) {

                if (n % j == 0) {
                    System.out.println("not prime");
                    flag = true;
                    break;
                }

            }
            if(flag == false){
                   System.out.println("prime");
                  
               }
        }

    }
}