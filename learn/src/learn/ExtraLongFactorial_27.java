package learn;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

class sum {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        
        BigInteger b = new BigInteger("1");
        
        for(int i=1;i<=n;i++)
        {
            b=b.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println(b);
    }

}


public class ExtraLongFactorial_27 {
	public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = 20;

        sum.extraLongFactorials(n);

      //  bufferedReader.close();
    }

}
