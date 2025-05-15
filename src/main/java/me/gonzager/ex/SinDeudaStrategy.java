package me.gonzager.ex;

public class SinDeudaStrategy extends AnalisisPrestamoDecorator {

    public SinDeudaStrategy(AnalisisPrestamoStrategy decorado) {
        super(decorado);
    }

    @Override
    public Boolean condicionEspecifica(Socio socio){
        return !socio.tieneDeuda();
    }
}
