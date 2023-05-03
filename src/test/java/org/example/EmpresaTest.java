package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void deveRetornarClientes() {
        Empresa empresa = new Empresa();
        empresa.assinarContrato("Apple", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Microsoft", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Xiaomi", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Samsung", "Ling xing ltda", "31234432");

        List<String> saida = Arrays.asList(
                "Cliente{nome='Apple', fornecedor='Xing ling ltda', cnpj='31234432'}",
                "Cliente{nome='Microsoft', fornecedor='Xing ling ltda', cnpj='31234432'}",
                "Cliente{nome='Xiaomi', fornecedor='Xing ling ltda', cnpj='31234432'}",
                "Cliente{nome='Samsung', fornecedor='Ling xing ltda', cnpj='31234432'}");

        assertEquals(saida, empresa.obterClientes());
    }

    @Test
    void deveRetornarTotalFornecedores() {
        Empresa empresa = new Empresa();
        empresa.assinarContrato("Apple", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Microsoft", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Xiaomi", "Xing ling ltda", "31234432");
        empresa.assinarContrato("Samsung", "Ling xing ltda", "31234432");

        assertEquals(2, FornecedorFactory.getTotalFornecedores());
    }
}