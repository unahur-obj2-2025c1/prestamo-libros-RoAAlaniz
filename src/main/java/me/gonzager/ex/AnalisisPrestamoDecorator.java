package me.gonzager.ex;

public abstract class AnalisisPrestamoDecorator extends AnalisisPrestamoStrategy {
    
    private AnalisisPrestamoStrategy decorado;

    public AnalisisPrestamoDecorator(AnalisisPrestamoStrategy decorado) {
        this.decorado = decorado;
    }

    @Override
    public Boolean puedePrestarse(Socio socio) {
        return this.condicionEspecifica(socio) && decorado.puedePrestarse(socio);
    }

    public abstract Boolean condicionEspecifica(Socio socio);
}