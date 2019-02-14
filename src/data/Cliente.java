/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Daniel
 */
public class Cliente {
    private String nombre;
    private int[] carritoCompras;

    public Cliente(String nombre, int[] carritoCompras) {
        this.nombre = nombre;
        this.carritoCompras = carritoCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(int[] carritoCompras) {
        this.carritoCompras = carritoCompras;
    }
    
    
}
