package com.preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IndexOf {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter wr = new PrintWriter(System.out);
//    int T = Integer.parseInt(br.readLine().trim());
    int T = 1;
//    for (int t_i = 0; t_i < T; t_i++) {
//      String S1 = br.readLine();
    String S1 = "We love to hack on hackerearth";
//      String S2 = br.readLine();
    String S2 = "hack";
//      String S3 = br.readLine();
//      char C = S3.charAt(0);
    char C = 'N';
//      int I = Integer.parseInt(br.readLine().trim());
    int I = 14;
//    System.out.println(S1 + ", " + S2 + ", " + S3 + ", " + C + ", " + I);
    solve(S1, S2, C, I);
//    }

    br.close();
    wr.close();
  }

  public static void solve(String S1, String S2, char C, int i) {
    int index = S1.indexOf(S2, i);
    if (C == 'Y') {
      int nextIndex = index + S2.length();
      if (nextIndex < S1.length() && S1.charAt(nextIndex) == ' ') {
        System.out.println(index);
      } else {
        System.out.println("Goodbye watson");
      }
    } else {
      if (index > 0) {
        System.out.println(index);
      } else {
        System.out.println("Goodbye watson");
      }

    }
  }
}
