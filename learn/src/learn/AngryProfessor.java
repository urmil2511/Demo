package learn;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
    int n=a.size();
    int count=0;
   // String y="YES",na="NO";
    for(Integer b:a)
    {
        if(b<1)
        count++;
    }
    if(k<=count)
    {
        return "NO";
    }
    else
    {
        return "YES";
    }
    }

}
public class AngryProfessor {
	public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  int t = Integer.parseInt(bufferedReader.readLine().trim());

       // for (int tItr = 0; tItr < t; tItr++) {
        //    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = 4;

            int k = 3;

           // String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int t[]= {-1,-2,3,4,5};
            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
               // int aItem = Integer.parseInt(t[i]);
                a.add(t[i]);
            }
    
            String result = Result.angryProfessor(k, a);
            System.out.print(result);
         //   bufferedWriter.write(result);
         //   bufferedWriter.newLine();
        }

    }




