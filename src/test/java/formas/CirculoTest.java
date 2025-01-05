package formas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CirculoTest {

    @Test
    public void deveperimetro() {
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        assertEquals(63, circulo.calcularPerimetro());
    }

    @Test
    public void deveArea() {
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        assertEquals(314, circulo.calcularArea());
    }

}