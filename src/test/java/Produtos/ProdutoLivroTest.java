package Produtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void testCalculoPrecoProdutoLivro() {
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setNome("1984");
        produtoLivro.setPrecoBase(50.00);
        assertEquals(47.50, produtoLivro.calcularPreco());
    }

}