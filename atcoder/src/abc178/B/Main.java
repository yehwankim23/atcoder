package abc178.B;

// URL: https://atcoder.jp/contests/abc178/tasks/abc178_b
// Task: Product Max
// Score: 200
// Time: 79 ms
// Memory: 25364 KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        long a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken()),
                c = Integer.parseInt(st.nextToken()),
                d = Integer.parseInt(st.nextToken()),
                max = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        
        if ((a <= 0 && b >= 0) || (c <= 0 && d >= 0)) {
            max = Math.max(max, 0);
        }
        
        System.out.println(max);
    }
}
