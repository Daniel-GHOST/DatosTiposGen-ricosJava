/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_generics_box;

/**
 *
 * @author Daniel
 */
class Box<T> {
    private T t;
    
    public T get() { return t; }
    public void set(T t) { this.t = t; }

    void inspect(String algo_de_texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
