package pal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by hegerbra on 16/01/16.
 */
public class Program {


    private int N;

    public void read() throws IOException {
    

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp[] = br.readLine().split(" ");

        N = Integer.parseInt(tmp[0]); //nodes

    }
}
