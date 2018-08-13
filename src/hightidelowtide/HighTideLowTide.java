/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hightidelowtide;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class HighTideLowTide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] tides=new int[n];
        for (int i=0;i<n;i++) {
            tides[i]=sc.nextInt();
        }
        
        Arrays.sort(tides);
        
        int middle;
        if (n%2!=0) middle=n/2;
        else middle=n/2-1;
        for (int i=0;i<n/2;i++) {
            System.out.print(tides[middle-i]+" "+tides[middle+1+i]+" ");
        }
        if (n%2!=0) System.out.print(tides[0]);
    }
    
}
