/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronflyweight;

import java.util.Scanner;

/**
 *
 * @author Jeison
 */
public class PatronFlyweight {

    public static Scanner sc = new Scanner(System.in);
    public static flyweifhtFactory ff = new flyweifhtFactory();
    
    public static void main(String[] args) {
        
        while(true){
            System.out.println("Opciones");
            System.out.println(" 1. agregar pais");
            System.out.println(" 2. agregar facultades universidad");
            System.out.println(" 3. agregar sedes universidad");
            System.out.println(" 4. agregar programas academicos");
            System.out.println(" 5. mostrar pais");
            System.out.println(" 6. mostrar facultades universidad");
            System.out.println(" 7. mostrar sedes universidad");
            System.out.println(" 8. mostrar programas academicos");
            System.out.println(" 9. salir");
            String opt = sc.nextLine();
            switch (opt){
                case "1":
                    System.out.println("Ingrese el nombre del pais");
                    agregarLista("pais");
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la facultad");
                    agregarLista("facultad");
                    break;
                case "3":
                    System.out.println("Ingrese el nombre de la sede");
                    agregarLista("sede");
                    break;
                case "4":
                    System.out.println("Ingrese el nombre del programa academico");
                    agregarLista("programa");
                    break;
                case "5":
                    System.out.println("mostrar paises");
                    mostrarLista("pais");
                    break;
                case "6":
                    System.out.println("mostrar facultades");
                    mostrarLista("facultad");
                    break;
                case "7":
                    System.out.println("mostrar sedes");
                    mostrarLista("sede");
                    break;
                case "8":
                    System.out.println("mostrar programas academicos");
                    mostrarLista("programa");
                    break;
                case "9":
                    System.exit(0);
                    break;
            }
        }
        
    }

    private static void agregarLista(String tipo) {
        String nombre = sc.nextLine();        
        ff.agregar(tipo, nombre);
        
    }

    private static void mostrarLista(String tipo) {
        ff.mostrar(tipo);
    }
    
}
