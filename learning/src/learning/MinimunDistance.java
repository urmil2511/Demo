package learning;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {

    	int n=a.size();
        int distance=-1;
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a.get(i).equals(a.get(j)))
                { 
                    l.add(j-i);
                    break;
                }
            }
        }
        try {
        distance=Collections.min(l);
        
        	return distance;
        }
        catch(Exception e)
        {
        	return -1;
        }
    
    }

}
public class MinimunDistance {
	public static void main(String[] args) throws IOException {
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        int [] aTemp = {2,3,4,5,2};
        List<Integer> a = new ArrayList<>();
        int n=aTemp.length;
        for (int i = 0; i < n; i++) {
            //int aItem = Integer.parseInt(aTemp[i]);
            a.add(aTemp[i]);
        }

        int result = Result.minimumDistances(a);
        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }


	}



