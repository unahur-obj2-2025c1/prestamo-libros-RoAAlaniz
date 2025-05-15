package me.gonzager.ex;

public class Libro {

 private String nombre;
 private AnalisisPrestamoStrategy analizadorPrestamo;

 public Libro (String nombre){
   this.nombre = nombre;
 }

  public void setAnalizadorPrestamoStrategy(AnalisisPrestamoStrategy analizadorPrestamo){
    this.analizadorPrestamo = analizadorPrestamo;
    analizadorPrestamo.setLibro(this);
  }

  public Boolean puedePrestarse(Socio socio){
    return this.analizadorPrestamo.puedePrestarse(socio);
  }

  public String getNombre(){
    return nombre;
  }
}