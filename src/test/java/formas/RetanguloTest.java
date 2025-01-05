package formas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    public void deveperimetro() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setLargura(2);
        assertEquals(14, retangulo.calcularPerimetro());
    }

    @Test
    public void deveArea() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setLargura(2);
        assertEquals(10, retangulo.calcularArea());
    }

}