package test.Descuentos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.Descuentos.Desc15Dias;
import main.Descuentos.SinDesc;
import main.Descuentos.Desc2Meses;

public class testDescuento {

    @Test
    public void testCalcularPrecioDesc15Dias() {
        Desc15Dias descuento = new Desc15Dias();
        Double total = 85.00;
        assertEquals(descuento.calcularPrecio(100.00), total);
    }

    @Test
    public void testCalcularPrecioSinDesc() {
        SinDesc descuento = new SinDesc();
        Double total = 100.00;
        assertEquals(descuento.calcularPrecio(100.00), total);
    }

    @Test
    public void testCalcularPrecioDesc2Meses() {
        Desc2Meses descuento = new Desc2Meses();
        Double total = 80.00;
        assertEquals(descuento.calcularPrecio(100.00), total);

    }
}
