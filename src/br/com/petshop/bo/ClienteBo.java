package br.com.petshop.bo;

import java.util.UUID;
import br.com.petshop.model.Cliente;

public class ClienteBo {
	Cliente cliente = new Cliente();
	public void cadastrarCliente(String nome,String cpf,String endereco) {
		cliente.setIdCliente(UUID.randomUUID().toString());
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEndereco(endereco);
	}
}
