/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool instance1 = ReusablePool.getInstance();
        assertNotNull("La instancia adquirida no debería ser nula", instance1);
        
        ReusablePool instance2 = ReusablePool.getInstance();
        assertSame(instance1, instance2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		// Crear una instancia del pool
        ReusablePool pool = ReusablePool.getInstance();

        try {
            // Intentar adquirir un objeto reusable del pool
            Reusable reusable = pool.acquireReusable();

            // Verificar que el objeto reusable adquirido no es nulo
            assertNotNull("El objeto reusable adquirido no debería ser nulo", reusable);
        } catch (Exception e) {
            // Si hay una excepción, imprimir un mensaje de error
            fail("No se debería lanzar una excepción al adquirir un objeto reusable del pool");
        }
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
	}

}
