/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidat3;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruben
 */


public class pilaArticulo {
    private Articulo pila[];
    private int tope;
    private int max;
    
    public pilaArticulo(){
        max = 15;
        tope = -1;
        pila = new Articulo[max];
    }
    
    private boolean pilaVacia(){
        return tope == -1;
    }
    
    private boolean pilaLlena(){
        return tope == max - 1;
    }
    
    public String ponerEnFila(Articulo articulo){
        if(!pilaLlena()){
            pila[++tope] = articulo;
            return "agregado con exito";
        }else{
            return "pila llena";
        }
    }
    
    public Articulo quitarEnFila(){
        if(!pilaVacia()){
            return pila[tope--];
        }else{
            System.out.println("Pila vacia");
            return null;
        }
    }
    
    public String listarPila(){
        String res = "";
        for(int i = 0; i <= tope; i++){
            res += pila[i].toString()+"\n";
        }
        return res;
    }
    
    public String listarPilaInversa(){
        String res = "";
        for(int i = tope; i >= 0; i--){
            res += pila[i].toString()+"\n";
        }
        return res;
    }
    public DefaultTableModel tablaModelo(boolean orden){
        DefaultTableModel dtm = new DefaultTableModel();
        Object datos[] = new Object[5];
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CODIGO");
        dtm.addColumn("PRECIO");
        dtm.addColumn("EXISTENCIA");
        dtm.addColumn("MARCA");
        int limite = orden? tope : 0;
        int inicio = orden? 0: tope;
        int dir = orden? 1:-1;
        for(int i = inicio; orden? i <= tope : i >= 0; i+=dir){
            datos[0] = pila[i].getNombre();
            datos[1] = pila[i].getCodigo();
            datos[2] = pila[i].getPrecio();
            datos[3] = pila[i].getExistencia();
            datos[4] = pila[i].getMarca();
            dtm.addRow(datos);
        }
        return dtm;
    }
}
