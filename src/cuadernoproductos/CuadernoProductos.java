/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadernoproductos;

import pantallas.JFrameListaProductos;

/**
 *
 * @author Piero354
 */
public class CuadernoProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio la ventana principal de gestor de citas.
        
        JFrameListaProductos framePrincipal= new JFrameListaProductos();
        framePrincipal.setLocationRelativeTo(null); 
        framePrincipal.setVisible(true);
    }
    
}
