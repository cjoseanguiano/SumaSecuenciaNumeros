/*
17. Leer una secuencia de números y sumar solo los pares mostrando el resultado del proceso.
 */
package sumasecuencianumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SumaSecuenciaNumeros {

    public static void main(String[] args) {

        int sec_num;
        int suma = 0;
        int nCuenta;

        nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros"));

        for (int i = 0; i < nCuenta; i++) {
            sec_num = Integer.parseInt(JOptionPane.showInputDialog("Numero"));

            if (sec_num % 2 == 0) {
                suma = suma + sec_num;
                System.out.println("Valor de la suma " + suma);

            }

        }

    }

}
