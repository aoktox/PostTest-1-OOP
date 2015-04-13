/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1_bil_Sempurna;
/**
 *
 * @author Agus
 */
public class cekSempurna {
    static boolean sempurna (int nilai){
        int count=0;
        for (int i = 1; i <= nilai/2; i++) {
            if (nilai%i==0)
                count+=i;
            //System.out.println(i);
        }
        return count==nilai;
    }
}
