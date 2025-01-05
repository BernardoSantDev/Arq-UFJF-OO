package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testCriacaoFuncionario() {
        Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");

        assertEquals("Maria", funcionario.getNome());
        assertEquals("Analista", funcionario.getCargo());
        assertEquals(5000.00, funcionario.getSalario());
        assertEquals("TI", funcionario.getDepartamento());
    }

    @Test
    void testReceberAumento() {
        Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");
        funcionario.receberAumento(10);
        assertEquals(5500.00, funcionario.getSalario());
    }

    @Test
    void testReceberAumentoNegativo() {
        try {
            Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");
            funcionario.receberAumento(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O percentual de aumento deve ser positivo", e.getMessage());
        }
    }

    @Test
    void testMudarDepartamento() {
        Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");
        funcionario.mudarDepartamento("RH");
        assertEquals("RH", funcionario.getDepartamento());
    }

    @Test
    void testMudarDepartamentoParaVazio() {
        try {
            Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");
            funcionario.mudarDepartamento("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O novo departamento não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void testExibirDados() {
        Funcionario funcionario = new Funcionario("Maria", "Analista", 5000.00, "TI");
        String dadosEsperados = "Nome: Maria, Cargo: Analista, Salário: 5000.00, Departamento: TI";
        assertEquals(dadosEsperados, funcionario.exibirDados());
    }

}
