/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int total = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, total);
    }

    public static int ingresarValor() {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int numero = 0;
        while (bandera) {
            try {
                System.out.println("Ingrese el numero tipo entero");
                numero = entrada.nextInt();

                if (numero % 2 == 0 && numero >= 0) {
                    System.out.println("Numero es par va directamente sumado");
                    bandera = false;
                } else {
                     if (numero %2 ==1){
                      throw new Exception("numero es impar por lo tanto no sera"
                              + "sumado, ingrese nuevamente \n");
                      
                     }else if (numero<0){
                          throw new Exception("numero es menor a 0"
                              + "sumado, ingrese nuevamente \n");
                     }
                }

            } catch (Exception e) {
                System.out.println("Error no se pueden ingresar letra o es "
                        + "numero negativo invalido");
            }
        }

        return numero;

    }

    public static int obtenerSuma(int valor1, int valor2) {
        int total = valor1 + valor2;
        return total;
    }

    public static void imprimir(int valor1, int valor2, int respuesta) {
        System.out.printf("La suma de: %d + %d es %d\n", valor1, valor2, respuesta);

    }

}
        
        
        
        
        
        
        
    


