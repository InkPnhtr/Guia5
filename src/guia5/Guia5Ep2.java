/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class Guia5Ep2 {
    public static void main(String[] args) {
        Scanner nro = new Scanner(System.in);
        System.out.println("Ing. un Entero: ");
        int n = nro.nextInt();
        int vector[] = new int[10];
        FillVector(vector);
        ShowVector(vector, n);
        
    }
    
    public static void FillVector(int[] vector){
        Random r = new Random();
        for (int i = 0; i < vector.length; i++ ){
            vector[i] = r.nextInt(10)+1;
            System.out.println("Pos: "+ i + " = " + vector[i]);
            
        }
        
    }
    
    public static void ShowVector(int[] vector, int n){
        int cont = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] == n){
                System.out.println("Se encontro n en Pos: " + i);
                cont ++;
            }
        }
            System.out.println("Total Hits = " + cont);
            if (cont == 0 ){
                System.out.println("No se encontro");
            }

    }
}
