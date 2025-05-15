package me.gonzager.ex;

public class MayorStrategy extends AnalisisPrestamoDecorator {

    public MayorStrategy(AnalisisPrestamoStrategy decorado) {
        super(decorado);
    }

    @Override
    public Boolean condicionEspecifica(Socio socio) {
        return socio.esMayorDeEdad();
    }

}
