package ar.edu.unlam.www.testcerradura;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.www.cerradura.Cerradura;

public class testCerradura {

	@Test
	public void testLlaveClaveCorrecta() {
		Cerradura miCerradura = new Cerradura(1234,3);
		
		assertTrue(miCerradura.abrir(1234));
	}
	
	@Test
	public void testLlaveClaveIncorrecta() {
		Cerradura miCerradura = new Cerradura(1234,3);
	
		assertFalse(miCerradura.abrir(654));
	}
	
	@Test
	public void testCerrar() {
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(1234);
		
		assertTrue(miCerradura.cerrar());
	}
	
	@Test
	public void testCerraduraEstaAbierta() {
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(1234);
		
		assertTrue(miCerradura.estaAbierta());
	}
	
	@Test
	public void testCerraduraEstaCerrada() {
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(1234);
		miCerradura.cerrar();

		assertTrue(miCerradura.estaCerrada());
	}
	
	@Test
	public void testFueBloqueada() {
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(789);
		miCerradura.abrir(456);
		miCerradura.abrir(456);
		
		assertTrue(miCerradura.fueBloqueada());
	}
	
	@Test
	public void testAperturasExitosas() {
		Cerradura miCerradura = new Cerradura(1234,3);
		Integer estimado = 4;
		
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		miCerradura.abrir(1234);
		
		System.out.print("\nAperturas Exitosas: " + miCerradura.aperturasExitosas());
		assertEquals(estimado, miCerradura.aperturasExitosas());
	}
	
	@Test
	public void testAperturasFallidas() {
		Cerradura miCerradura = new Cerradura(1234,3);
		Integer estimado = 2;
		
		miCerradura.abrir(789);
		miCerradura.abrir(456);
		
		System.out.print("\nAperturas Fallidas: " + miCerradura.aperturasFallidas());
		assertEquals(estimado, miCerradura.aperturasFallidas());
	}

} // fin class
