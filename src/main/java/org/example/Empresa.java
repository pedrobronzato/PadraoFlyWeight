package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Cliente> clientes = new ArrayList<>();

    public void assinarContrato(String nomeEmpresa, String nomeFornecedor, String cnpjFornecedor) {
        Fornecedor fornecedor = FornecedorFactory.getFornecedor(nomeFornecedor, cnpjFornecedor);
        Cliente cliente = new Cliente(nomeEmpresa, fornecedor);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }
}
