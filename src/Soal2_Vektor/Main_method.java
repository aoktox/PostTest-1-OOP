/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2_Vektor;

/**
 *
 * @author Agus
 */
public class Main_method {
    public static void main(String[] args) {
        HitungVektor V1 = new HitungVektor();
        HitungVektor V2 = new HitungVektor();
        HitungVektor hasil = new HitungVektor();
        V1.x=4;
        V1.y=5;
        V2.x=-3;
        V2.y=7;
        HitungVektor V3=HitungVektor.tambahVektor(V1, V2);
        HitungVektor V4=HitungVektor.kurangVektor(V1, V2);
        System.out.println("Nilai V3 = "+V3.tampilVektor());      
        System.out.println("Nilai V4 = "+V4.tampilVektor());
        
        //teramat sangat kurang
        /*
        int[] V1={ 4, 5};
        int[] V2={ -3, 7};
        int[] V3 = new int[2];
        int[] V4 = new int[2];
        HitungVektor hitung = new HitungVektor();
        System.out.println("Hasil penjumlahan vektor V1 dan V2 : ");
        V3 = HitungVektor.tambahVektor(V1, V2);
        for (int i = 0; i <V3.length; i++) {
            System.out.println(V3[i]);
        }
        
        System.out.println("Hasil pengurangan vektor V1 dengan V2 : ");
        V4 = HitungVektor.kurangVektor(V1, V2);
        for (int i = 0; i <V4.length; i++) {
            System.out.println(V4[i]);
        }
        */
    }
}
