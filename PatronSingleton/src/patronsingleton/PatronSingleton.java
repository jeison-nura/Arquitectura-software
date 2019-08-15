/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import java.util.Scanner;

/**
 *
 * @author Jeison
 */
public class PatronSingleton {

    /**
     * @param args the command line arguments
     */
    static boolean st = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(st){
            Configuracion c = Configuracion.getConfig();
            System.out.println("Opcion 1 uno agregar aplicacion");
            System.out.println("Opcion 2 ver lista de aplicaciones que usan esta configuracion");
            System.out.println("Opcion 3 salir");
            String op = sc.nextLine();
            switch(op){
                case "1":
                    System.out.println("Digite el nombre de la app");
                    String app = sc.nextLine();
                    c.añadirAplicacion(app);
                    break;
                case "2":
                    c.configuracionInicial();
                    break;
                case "3":
                    st = false;
                    break;
            }
        }
    }
    
}
