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
public class HitungVektor{
    int x;
    int y;
    static HitungVektor tambahVektor(HitungVektor V1, HitungVektor V2){
        HitungVektor hasil = new HitungVektor();
        hasil.x=V1.x+V2.x;
        hasil.y=V1.y+V2.y;
        return hasil;
    }
    
    static HitungVektor kurangVektor(HitungVektor V1, HitungVektor V2){
        HitungVektor hasil = new HitungVektor();
        hasil.x=V1.x-V2.x;
        hasil.y=V1.y-V2.y;
        return hasil;
    }
    
    String tampilVektor(){
        return "{ "+this.x+","+this.y+")";
    }
            
            
    //teramat sangat kurang
    /*
    static int[] tambahVektor(int[] A,int[] B){
        int hasil[]= new int[2];
        for (int i = 0; i < A.length; i++) {
            hasil[i]=A[i]+B[i];
        }
        return hasil;
    }
    
    static int[] kurangVektor(int[] A,int[] B){
        int hasil[]= new int[2];
        for (int i = 0; i < A.length; i++) {
            hasil[i]=A[i]-B[i];
        }
        return hasil;
    }
    */
}
