package org.example;

public class Cliente {

    private String nome;
    private Fornecedor fornecedorSede;

    public Cliente(String nome, Fornecedor fornecedorSede) {
        this.nome = nome;
        this.fornecedorSede = fornecedorSede;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", fornecedor='" + fornecedorSede.getNome() + '\'' +
                ", cnpj='" + fornecedorSede.getCnpj() + '\'' +
                '}';
    }
}
