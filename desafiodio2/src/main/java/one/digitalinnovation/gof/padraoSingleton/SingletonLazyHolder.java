package one.digitalinnovation.gof.padraoSingleton;

public class SingletonLazyHolder {
    private static class instanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return instanceHolder.instancia;
    }
}
