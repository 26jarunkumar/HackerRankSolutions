import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
	// Find the Number of Pairs(a set of socks)
	// Find the Matching Numbers[colors] either through iterating an Array using 2 for Loops
	// Or just match a key - value Pair like a hash map
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        int pair = n/2;
        Map matchingMap = new HashMap();
          	for (int j=0;j<ar.length;j++) {
        		if(matchingMap.containsKey(ar[j]) && matchingMap.get(ar[j]).equals(new Integer(1)))  {
        			result ++;
        			if(result != pair) {
        			matchingMap.put(ar[j], 0);
        			continue;
        			}break;
         		}
        		matchingMap.put(ar[j], 1);
        	}
    
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
