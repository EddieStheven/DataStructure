package MercadoPreso;

import MercadoPreso.Clientes.TipoCliente;
import MercadoPreso.Clientes.noCliente;

public class MercadoPrisão {

    public noCliente noCliente;

    public MercadoPrisão(MercadoPreso.Clientes.noCliente noCliente) {
        this.noCliente = noCliente;
    }

    public void cadastrarCliente(String nome, String email, TipoCliente tipoConsumidor){
        noCliente novoCliente = new noCliente(nome,email,tipoConsumidor);
    }




    
}
