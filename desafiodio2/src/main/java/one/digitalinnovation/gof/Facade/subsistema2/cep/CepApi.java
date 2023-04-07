package one.digitalinnovation.gof.Facade.subsistema2.cep;

import one.digitalinnovation.gof.padraoSingleton.SingletonEager;

public class CepApi {
    private static final CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Entre-rios";
    }
    public String recuperarEstado(String cep){
        return "BA";
    }
}
