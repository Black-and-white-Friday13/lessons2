import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < a.length; i++){
            if (i < b.length) {
                b[j] = a[i];
                ++j;
            }
            else {
                c[k] = a[i];
                ++k;
            }
        }
        for (int i : c){
            System.out.println(i);
        }

    }
}


