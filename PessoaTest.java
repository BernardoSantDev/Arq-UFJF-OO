package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void testCriacaoPessoa() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);

        assertEquals("João", pessoa.getNome());
        assertEquals(20, pessoa.getIdade());
        assertEquals(1.75, pessoa.getAltura());
        assertEquals(70.0, pessoa.getPeso());
    }

    @Test
    void testEnvelhecer() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
        pessoa.envelhecer();
        assertEquals(21, pessoa.getIdade());
    }

    @Test
    void testCrescerAntesDos21() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
        pessoa.crescer(5);
        assertEquals(1.80, pessoa.getAltura(), 0.001);
    }

    @Test
    void testNaoCrescerApos21() {
        Pessoa pessoa = new Pessoa("João", 21, 1.75, 70.0);
        pessoa.crescer(5);
        assertEquals(1.75, pessoa.getAltura());
    }

    @Test
    void testGanharPeso() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
        pessoa.ganharPeso(5);
        assertEquals(75.0, pessoa.getPeso());
    }

    @Test
    void testPerderPeso() {
        Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
        pessoa.perderPeso(5);
        assertEquals(65.0, pessoa.getPeso());
    }

    @Test
    void testPerderPesoNegativo() {
        try {
            Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
            pessoa.perderPeso(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso perdido deve ser positivo", e.getMessage());
        }
    }

    @Test
    void testGanharPesoNegativo() {
        try {
            Pessoa pessoa = new Pessoa("João", 20, 1.75, 70.0);
            pessoa.ganharPeso(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O peso ganho deve ser positivo", e.getMessage());
        }
    }
}