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
        //creando scanner   
        Scanner sc = new Scanner(System.in);
        int vidas = 3, num = 1;
        int numeroAleatorio = 1;
        //Variable que genera los numeros aleatorios
        numeroAleatorio = (int) (Math.random() * 10 + 1);
        while (vidas > 0 && num != numeroAleatorio) {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            if (num == numeroAleatorio) {
                System.out.println("Felicidades as acertado");
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
