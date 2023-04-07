package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.Facade.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.Facade.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
