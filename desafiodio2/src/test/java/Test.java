import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.padraoSingleton.SingletonEager;
import one.digitalinnovation.gof.padraoSingleton.SingletonLazy;
import one.digitalinnovation.gof.padraoSingleton.SingletonLazyHolder;
import one.digitalinnovation.gof.padraoStrategy.*;

public class Test {
    public static void main(String[] args) {

        System.out.println("Singleton: ");
        System.out.println();
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println("=========");
        System.out.println();
        System.out.println("Strategy:");
        System.out.println();
        Comportamento normal = new ComportamentoNormal();
        Comportamento atacante = new ComportamentoOfensivo();
        Comportamento defensivo= new ComportamentoDefensivo();

        Robo roboto = new Robo();
        roboto.setComportamento(normal);
        roboto.mover();
        roboto.mover();
        roboto.setComportamento(atacante);
        roboto.mover();
        roboto.setComportamento(defensivo);
        roboto.mover();

        System.out.println("=========");
        System.out.println();
        System.out.println("Facade:");
        System.out.println();
        Facade facade = new Facade();
        facade.migrarCliente("Wash", "41275390");

    }
}
