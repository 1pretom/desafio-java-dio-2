package one.digitalinnovation.gof.padraoStrategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Modo de defesa ativado");
    }
}
