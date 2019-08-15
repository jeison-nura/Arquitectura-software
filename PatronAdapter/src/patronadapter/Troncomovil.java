/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronadapter;

/**
 *
 * @author Jeison
 */
public class Troncomovil implements vehiculo{

    troncoMovilAdapter _troncomovil = new troncoMovilAdapter();
    
    @Override
    public void Frenar() {
        _troncomovil.bajarPies();
        _troncomovil.rozarPies();
    }

    @Override
    public void Acelerar() {
        _troncomovil.bajarPies();
        _troncomovil.correr();
    }
    
}
