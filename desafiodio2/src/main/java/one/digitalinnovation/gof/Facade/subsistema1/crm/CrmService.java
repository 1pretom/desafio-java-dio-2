package one.digitalinnovation.gof.Facade.subsistema1.crm;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep,String  estado, String cidade){
        System.out.println("Cliente salvo no sistema de CRM");

    }
}
