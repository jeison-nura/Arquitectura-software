/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.facade;

/**
 *
 * @author Jeison
 */
public class fachada {
    ModuloVentas modventas = new ModuloVentas();
    
    public void crearOportunidadVenta(){
        modventas.oportunidadVentas();
    }
    public void validarHidtorialCredito(){
        System.out.println("Se valida historial de credito");
    }
    
}
