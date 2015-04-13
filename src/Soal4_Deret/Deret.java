/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4_Deret;

/**
 *
 * @author Agus
 */
public class Deret {
    static boolean Prima(int x){
        int f = 0;
        for (int i = 1; i <= x; i++) {
            if (x%i==0){
                f++;
                if (f>3) return false;
            }
        }
        return f==2;
    }
    
    static void cetakPrima (int nilai){
        for (int i = 0; i <=nilai; i++) {
            if(Prima(i))
                System.out.print(i +" ");
        }
    }
    
    static void cetakVibonanci(int nilai){
        int[] vibo= new int[nilai];
        vibo[0]=1;
        vibo[1]=1;
        for (int i = 2; i < nilai; i++) {
            vibo[i]=vibo[i-2]+vibo[i-1];
        }
        for (int i = 0; i <vibo.length; i++) {
            System.out.print(vibo[i]+" ");
        }
    }
}
