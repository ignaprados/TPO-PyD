package test.Reservas.Extras;

// Import Junit
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

// Import Assert
import static org.junit.Assert.*;


// Import Extras
import main.Reservas.Extras.Extra;
import main.Reservas.Extras.Extras;


public class testExtras {

    private Extras extras;
    private Extra extra1;
    private Extra extra2;

    @Before
    public void setUp() {
        extras = new Extras();
        extra1 = new Extra(001, "Extra 1", 1000);
        extra2 = new Extra(002, "Extra 2", 1500);

        extras.agregarExtra(extra1);
        extras.agregarExtra(extra2);
    }

    @Test
    public void testAgregarExtra() {
        ArrayList<Extra> listaExtras = extras.getListaExtra();
        Extra extra3 = new Extra(003,"Extra 3",800);

        extras.agregarExtra(extra3);

        assertTrue(listaExtras.contains(extra3));
        assertEquals(listaExtras.size(), 3);

    }

    @Test
    public void testEliminarExtra() {
        ArrayList<Extra> listaExtras = extras.getListaExtra();

        extras.eliminarExtra(extra1);

        assertFalse(listaExtras.contains(extra1));
        assertTrue(listaExtras.contains(extra2));
    }
}
