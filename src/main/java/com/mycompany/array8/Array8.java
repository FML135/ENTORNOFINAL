/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array8;

/**
 *
 * @author administrador
 */
public class Array8 {

    public static void main(String[] args) throws InterruptedException {
        int [] n;
        System.out.println("Esta es la temperatura media del año 2020");
        n=new int[12];
        n[0]=5;
        n[1]=7;
        n[2]=10;
        n[3]=12;
        n[4]=17;
        n[5]=22;
        n[6]=25;
        n[7]=20;
        n[8]=28;
        n[9]=15;
        n[10]=10;
        n[11]=6;
        for(int i=0; i<12;i++){
            int y=n[i];
            for( int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
