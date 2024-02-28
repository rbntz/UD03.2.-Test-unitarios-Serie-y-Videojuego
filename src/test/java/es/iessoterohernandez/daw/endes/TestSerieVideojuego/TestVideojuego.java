package es.iessoterohernandez.daw.endes.TestSerieVideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestVideojuego {
	
	private Videojuego videojuego;

	@BeforeEach
	public void init() {
		videojuego = new Videojuego("Beyond Good & Evil", 20, "Aventuras", "Ubisoft");
	}
	
	@Test
	public void testEntregadoCorrectamente() {
		videojuego.entregar();
		assertTrue(videojuego.isEntregado());
	}
	
	@Test
	public void testDevueltoCorrectamente() {
		videojuego.devolver();
		assertFalse(videojuego.isEntregado());
	}
	
	@Test
	//Test método compareTo
	public void testCompararVideojuegosPorHorasEstimadas() {
		Videojuego videojuego2 = new Videojuego("Outer Wilds", 60, "Aventuras", "Mobius Digital");
		assertTrue(videojuego.compareTo(videojuego2) < 0);
	}
	
	@Test
	//Test método Equals
	public void testCompararVideojuegosPorTituloYCompañia() {
		Videojuego videojuegoIgual = new Videojuego("Beyond Good & Evil", 20, "Aventuras", "Ubisoft");
		assertTrue(videojuego.equals(videojuegoIgual));
	}

}
