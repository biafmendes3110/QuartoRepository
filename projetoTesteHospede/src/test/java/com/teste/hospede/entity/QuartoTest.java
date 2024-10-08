package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuartoTest {

	private Quarto quarto;

	@BeforeEach
	void setUp() {
		quarto = new Quarto(1L, "314", "suite");
	}

	@Test
	@DisplayName("Testando o id")
	void testId() {
		quarto.setId(2L);
		// Assert
		assertEquals(2L, quarto.getId());
	}

	@Test
	@DisplayName("Testando o numero")
	void testNum() {
		quarto.setNum("314");
		// Assert
		assertEquals("314", quarto.getNum());
	}

	@Test
	@DisplayName("Testando o tipo")
	void testTipo() {
		quarto.setTipo("Suite");
		// Assert
		assertEquals("Suite", quarto.getTipo());
	}

	@Test
	@DisplayName("Testando o construtor")
	void testConstrutorAll() {
		Quarto novoQuarto = new Quarto(3L, "314", "Suite");
		assertAll("novoQuarto", () -> assertEquals(3L, novoQuarto.getId()),
				() -> assertEquals("314", novoQuarto.getNum()), 
				() -> assertEquals("Suite", novoQuarto.getTipo()));
	}
}
