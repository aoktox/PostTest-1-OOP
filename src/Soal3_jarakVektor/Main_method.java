/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3_jarakVektor;

/**
 *
 * @author Agus
 */
public class Main_method {
    public static void main(String[] args) {
        titik a = new titik();
        titik b = new titik();
        int d;
        a.x=3;
        a.y=4;
        b.x=17;
        b.y=20;
        d=a.hitungJarak(b);
        System.out.println(d);
    }
}
