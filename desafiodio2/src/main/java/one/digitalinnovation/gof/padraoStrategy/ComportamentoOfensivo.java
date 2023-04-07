package one.digitalinnovation.gof.padraoStrategy;

public class ComportamentoOfensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Modo de ataque");
    }
}
