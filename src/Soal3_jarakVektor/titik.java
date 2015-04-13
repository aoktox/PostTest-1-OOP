/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3_jarakVektor;

import static java.lang.Math.*;

/**
 *
 * @author Agus
 */
public class titik {
    int x;
    int y;
    int hitungJarak (titik b){
        return (int) sqrt(pow((x-b.x),2)+pow((y-b.y),2));
    }
}
