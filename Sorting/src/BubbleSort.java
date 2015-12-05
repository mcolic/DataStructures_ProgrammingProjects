/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Medina
 */

import java.util.Scanner;

public class BubbleSort {
    static int[] sort(int[] sequence) 
    {
       
        for (int i = 0; i < sequence.length; i++)
            for (int j = 0; j < sequence.length - 1; j++)
                if (sequence[j] > sequence[j + 1]) 
                {
                    sequence[j] = sequence[j] + sequence[j + 1];
                    sequence[j + 1] = sequence[j] - sequence[j + 1];
                    sequence[j] = sequence[j] - sequence[j + 1];
                }
        return sequence;
    }
 
    static void printSequence(int[] sorted_sequence) 
    {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }

    
}
public static void main(String[] args)  
    {
        Scanner scan = new Scanner( System.in );
 
        
        int n, i;
        n = scan.nextInt();
        /* Create integer array on n elements */
        int arr[] = new int[ n ];
        /* Accept elements */
        System.out.println("\nEnter "+ n +" integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        /* Call method sort */
        sort(arr);
        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }
 
}

