package unidat3;

public class Articulo {
    private String nombre;
    private int codigo;
    private byte existencia;
    private double precio;
    private String marca;

    public Articulo(String nombre, int codigo, byte existencia, double precio, String marca) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.existencia = existencia;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public byte getExistencia() {
        return existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setExistencia(byte existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", codigo=" + codigo + ", existencia=" + existencia + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
    
}
