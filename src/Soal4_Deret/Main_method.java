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
public class Main_method {
    public static void main(String[] args) {
        int n=10;
       // System.out.println(Deret.Prima(n));
        System.out.println("Deret prima sampai ke "+n);
        Deret.cetakPrima(n);
        System.out.println("\nDeret vibonaci sebanyak "+n+" bilangan");
        Deret.cetakVibonanci(n);
    }
}