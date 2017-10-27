/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author User
 */
public class operaciones {

    public int prueba_medios(double promedio, int iteracion) {

        double li = 0,
                ls = 0;
        int dato = 0;

        li = (0.5 - 1.96) * (1 / (Math.sqrt(12 * iteracion)));
        ls = (0.5 + 1.96) * (1 / (Math.sqrt(12 * iteracion)));

        if (li < promedio && ls > promedio) {

            dato = 1;
        } else {
            dato = 0;
        }

        return dato;

        /*NOTA Si dato es igual uno se encuentra dentro de los limites de aceptacion, en caso que Dato sea cero no se encuentra 
      dentro de los limites de aceptacion
       ----> nivel de aceptación de 95 por ciento
       a = 5%,*/
    }

    public int varianza(double promedio, int iteracion) {
        double li = 0,
                ls = 0,
                Vr = 0;
        int dato = 0;

        Vr = ((1 / iteracion - 1) * promedio);
        ls = 58.1200541 / 12 * (iteracion - 1);
        li = 23.6543003 / 12 * (iteracion - 1);

        if (li < promedio && ls > promedio) {

            dato = 1;
        } else {
            dato = 0;
        }

        return dato;

        /*NOTA Si dato es igual uno se encuentra dentro de los limites de aceptacion, en caso que Dato sea cero no se encuentra 
      dentro de los limites de aceptacion
       ----> nivel de aceptación de 95 por ciento
       a = 5%,*/
    }
    
    

}
