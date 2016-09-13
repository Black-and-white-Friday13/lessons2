import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Fridayl3 on 9/13/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(reader.readLine());
                }
        int[] b = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < a.length; i++){
            if (b.length > i)
                b[i] = a[i];
            else
                c[i] = a[i];
            System.out.println(c[i]);
        }

    }
}


