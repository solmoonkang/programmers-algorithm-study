package baekjoon.단계문제.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class A더하기B_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            int sum = A + B;

            bufferedWriter.write("Case #" + i + ": " + A + " + " + B + " = " + sum);
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
