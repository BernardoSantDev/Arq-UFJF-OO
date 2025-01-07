package Produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void testCalculoPrecoProdutoRoupa() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("1984");
        produtoRoupa.setPrecoBase(100.00);
        assertEquals(80.00, produtoRoupa.calcularPreco());
    }
}