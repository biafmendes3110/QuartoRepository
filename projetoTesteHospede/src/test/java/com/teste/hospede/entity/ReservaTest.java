package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ReservaTest {

	private Reserva reserva;
	private Hospede hospede;
	private Quarto quarto;

	@BeforeEach
	public void setUp() {
		//Arrange
		reserva = new Reserva(1L, hospede, quarto, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 9, 10));
	}

	@Test
	public void testId() {
		reserva.setId(2L);
		// Assert
		assertEquals(2L, reserva.getId(), "O ID deve ser igual ao valor atribuido");
	}

	@Test
	public void testHospede() {
		// Act
		reserva.setHospede(hospede);

		// Assert
		assertEquals(hospede, reserva.getHospede(), "O hospede deve ser igual ao valor atribuido");
	}

	@Test
	public void testQuarto() {
		// Act
		reserva.setQuarto(quarto);

		// Assert
		assertEquals(quarto, reserva.getQuarto(), "O quarto deve ser igual ao valor atribuido");
	}

	@Test
	public void testCheckInData() {
		reserva.setCheckInData(LocalDate.of(2024, 9, 1));
		// Assert
		assertEquals(LocalDate.of(2024, 9, 1), reserva.getCheckInData(),
				"A Data de check-in deve ser igual ao valor atribuido");

	}

	@Test
	public void testCheckOutData() {
		reserva.setCheckOutData(LocalDate.of(2024, 9, 10));
		// Assert
		assertEquals(LocalDate.of(2024, 9, 10), reserva.getCheckOutData(),
				"A Data de check-out deve ser igual ao valor atribuido");

	}

	@Test
	@DisplayName("Testando o construtor")
	void testConstrutorAll() {
		Reserva novoReserva = new Reserva(3L, hospede, quarto, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 9, 10));
		assertAll("novoReserva", () -> assertEquals(3L, novoReserva.getId()),
				() -> assertEquals(quarto, novoReserva.getHospede()),
				() -> assertEquals(quarto, novoReserva.getQuarto()),
				() -> assertEquals(LocalDate.of(2024, 9, 1), novoReserva.getCheckInData()),
				() -> assertEquals(LocalDate.of(2024, 9, 10), novoReserva.getCheckOutData()));
	}
}
