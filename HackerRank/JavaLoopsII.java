package test;

import java.util.Scanner;

/**
 *
 * @author Shabab-1281539
 */
public class JavaLoopsII {

    public static void main(String[] args) {
		//Input
		//2
		//0 2 10
		//Output - 2 6 14 30 62 126 254 510 1022 2046 
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String result = "";
            for (int j = 0; j < n; j++) {
                int exponentResult = 0;
                for (int k = 0; k < j + 1; k++) {
                    exponentResult += getExponentResult(k, b);
                }
                result += a + exponentResult + " ";
                
                
            }
            System.out.println(result);
        }
        in.close();

    }
    
    public static int getExponentResult(int exponent, int b){
        return (int) (Math.pow(2, exponent) * b);
    }

}
