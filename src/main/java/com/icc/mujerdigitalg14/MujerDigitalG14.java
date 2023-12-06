/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.icc.mujerdigitalg14;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author martinmelogodinez
 */
public class MujerDigitalG14 {

    public static void main(String[] args) { 
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        /*
            // 1. Sumar dos números

            System.out.println("Dame el primer número");
            int num1 = scanner.nextInt();

            System.out.println("Dame el segundo número");
            int num2 = scanner.nextInt();

            int suma = num1 + num2;

            System.out.println("El resultado de la suma es: " + suma);
        */
        
        
        // 2. Calificaciones + Estadística
        // Recibir calificaciones desde el teclado separadas por comas
        // Calcular el promedio, calcular la mediana, obtener
        // la calificación más baja y la calificación más alta
        
        // A) Recibir calificaciones del teclado
        System.out.println("Dame las calificaciones separadas por comas");
        String calificacionesInput = scanner.nextLine();
        System.out.println("Calificaciones Input" + calificacionesInput);
        
        // B) Convertir el string a un arreglo
        String[] calificacionesStr = calificacionesInput.split(",");
        System.out.println("Calificaciones en arreglo de strings: " + Arrays.toString(calificacionesStr));
        
        // C) Convertir el arreglo de strings a un arreglo de ints
        int[] calificaciones = Arrays.stream(calificacionesStr).mapToInt(Integer::parseInt).toArray();
        
        // D) Calcular el promedio
        int noCalificaciones = calificaciones.length;
        
        double totalCalificaciones = 0;
        for(int i = 0; i < noCalificaciones; i++) {
            int calificacion = calificaciones[i];
            totalCalificaciones += calificacion;
        }
        
        double promedio = totalCalificaciones / noCalificaciones;
        System.out.println("El promedio es: " + promedio);
        
        // E) Calcular mediana
        // E.1 - Ordenar.
        Arrays.sort(calificaciones);
        System.out.println("Arreglo ordenado: " + Arrays.toString(calificaciones));
        
        // E.2 - Validar si es par o impar
        if (noCalificaciones % 2 != 0) {
            int mediana = calificaciones[((noCalificaciones + 1) / 2) -1];
            System.out.println("Mediana: " + mediana);
        } else {
            double num1 = calificaciones[(noCalificaciones / 2) - 1];
            double num2 = calificaciones[(noCalificaciones / 2)];
            double mediana = (num1 + num2) / 2;
            System.out.println("Mediana: " + mediana);
        }
        
        // F) Encontrar la calificación más baja
        int califBaja = calificaciones[0];
        System.out.println("La calificación más baja es: " + califBaja);
        
        // G) Encontrar la calificación más alta
        int califAlta = calificaciones[noCalificaciones - 1];
        System.out.println("La calificación más alta es: " + califAlta);
        
        // H) Calcular la moda - NOTA: Si los valores están ordenados, todas las calificaciones
        // con el mismo valor están juntas
        
        
        
    }
}
