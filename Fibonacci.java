/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, a, b, c, jml=1;
        Scanner sc = new Scanner(System.in);
        a=0;
        b=1;
        
        System.out.print("Input : ");
        n = sc.nextInt();
        
        System.out.print(b+" ");
        for(int i=1; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            jml=jml+c;
        }
        System.out.println();
        System.out.print(c);
        
    }

    
}
