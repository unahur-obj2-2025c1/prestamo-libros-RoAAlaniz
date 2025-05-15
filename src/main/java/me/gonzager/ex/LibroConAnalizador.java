package me.gonzager.ex;

public class LibroConAnalizador {
    private String nombre;
    private AnalisisPrestamoStrategy analizador = new DefaultStrategy();

    public LibroConAnalizador(String nombre) {
        this.nombre = nombre;
    }

    public Libro build(){
        var libro = new Libro(this.nombre);
        libro.setAnalizadorPrestamoStrategy(analizador);
        return libro;
    }

    public LibroConAnalizador clasico(){
        this.analizador = new ClasicoStrategy(analizador);
        return this;
    }

    public LibroConAnalizador adulto(){
        this.analizador = new MayorStrategy(analizador);
        return this;
    }

    public LibroConAnalizador sinDeuda(){
        this.analizador = new SinDeudaStrategy(analizador);
        return this;
    }

    public LibroConAnalizador umbral(){
        this.analizador = new UmbralUnico(analizador);
        return this;
    }
}