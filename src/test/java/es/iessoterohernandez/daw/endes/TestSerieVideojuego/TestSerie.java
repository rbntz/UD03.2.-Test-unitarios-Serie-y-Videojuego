package es.iessoterohernandez.daw.endes.TestSerieVideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSerie {
	
	private Serie serie;

	@BeforeEach
	public void init() {
		serie = new Serie("Pequeñas Mentirosas", 7, "Suspense", "Marlene King");
	}
	
	@Test
	public void testEntregadoCorrectamente() {
		serie.entregar();
		assertTrue(serie.isEntregado());
	}
	
	@Test
	public void testDevueltoCorrectamente() {
		serie.devolver();
		assertFalse(serie.isEntregado());
	}
	
	@Test
	//Test método compareTo
	public void testCompararSeriesPorNumTemporadas() {
		Serie serie2 = new Serie("Juego de Tronos", 8, "Drama", "George RR Martin");
		assertTrue(serie.compareTo(serie2) < 0);
	}
	
	@Test
	//Test método Equals
	public void testCompararSeriesPorTituloYCreador() {
		Serie serieIgual = new Serie("Pequeñas Mentirosas", 7, "Suspense", "Marlene King");
		assertTrue(serie.equals(serieIgual));
	}
	

}
