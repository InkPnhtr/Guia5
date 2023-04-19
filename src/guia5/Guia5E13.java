/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author U
 */
public class Guia5E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Equipo = new String[7];
        Equipo[0] = "Norberto";
        Equipo[1]="Aldana";
        Equipo[2] = "Carlos";
        Equipo[3]="Giselle";
        Equipo[4] = "Jesus";
        Equipo[5]="Luciano";
        Equipo[6] = "Ruben";
        for (int i = 0; i < Equipo.length ; i++) {
            String string = Equipo[i];
            System.out.println("Miembro Nro: " +  i +" " + string);
        }
    }
    
}
