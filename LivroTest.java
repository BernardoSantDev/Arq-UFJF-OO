package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testandoAbrir(){
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        assertEquals("O Nicholas", livro.getTitulo());
        assertEquals("Badin",livro.getAutor());
        assertEquals(2024, livro.getAno_publicacao());
        assertEquals(50, livro.getNumero_paginas());
        assertEquals("Biografia", livro.getGenero());
    }

    @Test
    void abrindoLivro(){
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        livro.abrir();
        assertTrue(livro.isAberto());
    }

    @Test
    void abrindoLivroAberto(){
        try {
            Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
            livro.abrir();
            livro.abrir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(" O livro já esta aberto", e.getMessage());
        }
    }

    @Test
    void fechandoLivro(){
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        livro.abrir();
        livro.fechar();
        assertFalse(livro.isAberto());
        assertEquals(0, livro.getPaginaAtual());
    }

    @Test
    void fechandoLivroFechado(){
        try {
            Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
            livro.fechar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(" O livro já esta fechado", e.getMessage());
        }
    }

    @Test
    void marcandoPaginaValida() {
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        livro.abrir();
        livro.marcar_pagina(25);
        assertEquals(25, livro.getPaginaAtual());
    }

    @Test
    void marcandoPaginaInvalida() {
        try {
            Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
            livro.abrir();
            livro.marcar_pagina(60);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao foi possivel marcar a pagina", e.getMessage());
        }
    }

    @Test
    void avancandoPagina() {
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        livro.abrir();
        livro.marcar_pagina(10);
        livro.avancarPag();
        assertEquals(11, livro.getPaginaAtual());
    }

    @Test
    void avancandoPaginaInvalida() {
        try {
            Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
            livro.abrir();
            livro.marcar_pagina(50);
            livro.avancarPag();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível avançar. Verifique se o livro está aberto ou se já está na última página.", e.getMessage());
        }
    }

    @Test
    void retrocedendoPagina() {
        Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
        livro.abrir();
        livro.marcar_pagina(10);
        livro.retrocederPagina();
        assertEquals(9, livro.getPaginaAtual());
    }

    @Test
    void retrocedendoPaginaInvalida() {
        try {
            Livro livro = new Livro("O Nicholas", "Badin", 2024, 50, "Biografia");
            livro.abrir();
            livro.retrocederPagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não foi possível retroceder. Verifique se o livro está aberto ou se já está na primeira página.", e.getMessage());
        }
    }
}
