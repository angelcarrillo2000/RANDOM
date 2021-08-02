/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random n = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int vidas = 3;
        int numeroAleatorio = n.nextInt(5) + 1;
        while (vidas > 0) {
            if (num == numeroAleatorio) {
                System.out.println("Felicidades as acertado");
                break;
            } else if (num != numeroAleatorio) {
                System.out.println("NUMERO INCORRECTO");
                vidas--;
            }
            if (vidas == 0) {
                System.out.println("Perdiste el numero es: " + numeroAleatorio);
            }
        }
    }
}
