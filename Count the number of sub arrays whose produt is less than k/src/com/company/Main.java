package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int[] output = new int[times];
        for(int i=0;i<times;i++) {
            process(scanner,i,output);
        }
        for(int i=0;i<times;i++){
            System.out.println(output[i]);
        }
    }

    private static void process(Scanner scanner,int I,int[] output) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = scanner.nextInt();
        }
        StringBuilder lol = new StringBuilder(Integer.toString(input[0]));
        for(int i=1;i<n;i++){
            lol.append(input[i]);
        }
        ArrayList<String> intermediate = new ArrayList<>();
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<=input.length;j++){
                intermediate.add(lol.substring(i,j));
            }
        }
        int count = 0;
        for(String a : intermediate){
            int temp = 1;
            for(int i=0;i<a.length();i++){
                temp *= Integer.parseInt(Character.toString(a.charAt(i)));
            }
            if(temp <= k){
                count++;
            }
        }
        output[I] = count;
    }
}
