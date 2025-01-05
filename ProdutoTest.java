package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testCriacaoProduto() {
        Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");

        assertEquals("Notebook", produto.getNome());
        assertEquals(3000.00, produto.getPreco());
        assertEquals(10, produto.getQuantidadeEstoque());
        assertEquals("Eletrônicos", produto.getCategoria());
    }

    @Test
    void testAdicionarEstoque() {
        Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
        produto.adicionarEstoque(5);
        assertEquals(15, produto.getQuantidadeEstoque());
    }

    @Test
    void testAdicionarEstoqueInvalido() {
        try {
            Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
            produto.adicionarEstoque(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade adicionada deve ser positiva", e.getMessage());
        }
    }

    @Test
    void testRemoverEstoque() {
        Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
        produto.removerEstoque(5);
        assertEquals(5, produto.getQuantidadeEstoque());
    }

    @Test
    void testRemoverEstoqueInvalido() {
        try {
            Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
            produto.removerEstoque(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A quantidade removida deve ser positiva", e.getMessage());
        }
    }

    @Test
    void testRemoverEstoqueInsuficiente() {
        try {
            Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
            produto.removerEstoque(15);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade insuficiente no estoque", e.getMessage());
        }
    }

    @Test
    void testAplicarDesconto() {
        Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
        produto.aplicarDesconto(10); // 10% de desconto
        assertEquals(2700.00, produto.getPreco());
    }

    @Test
    void testAplicarDescontoInvalidoNegativo() {
        try {
            Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
            produto.aplicarDesconto(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de desconto inválido", e.getMessage());
        }
    }

    @Test
    void testAplicarDescontoInvalidoAcima100() {
        try {
            Produto produto = new Produto("Notebook", 3000.00, 10, "Eletrônicos");
            produto.aplicarDesconto(150);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de desconto inválido", e.getMessage());
        }
    }
}
