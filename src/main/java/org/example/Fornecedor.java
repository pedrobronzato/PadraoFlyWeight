package org.example;

public class Fornecedor {

    private String nome;
    private String cnpj;

    public Fornecedor(String nome, String uf) {
        this.nome = nome;
        this.cnpj = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
