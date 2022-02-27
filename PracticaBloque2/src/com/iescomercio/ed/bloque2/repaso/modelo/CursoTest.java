package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {
	Curso c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = new Curso();
		Persona p1 = new Persona("12345678A", "Aitor", "Simon");
		Persona p2 = new Persona("12345678Z", "Alberto", "Martinez");
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);
	}
	@Test
	void testEliminarAlumno() {
		//test con una longitud de dni adecuada
		boolean haPasado=false;
		try {
			c.eliminarAlumno("12345678A");
			assertEquals(1, c.numeroAlumnos());
		} catch (Exception e) {
			haPasado=true;
		}
		assertFalse(haPasado);
		//test con una longitud de dni inadecuada
		Persona p4= new Persona("123G","Jorge","Jimenez");
		c.aniadirAlumno(p4);
		Exception e=assertThrows
				(Exception.class, ()->c.eliminarAlumno("El dni no tiene la longitud adecuada"));
		assertEquals("El dni no tiene la longitud adecuada", e.getMessage());
	}

	@Test
	void testAniadirAlumno() {
		int numAntes = c.numeroAlumnos();
		c.aniadirAlumno(new Persona("12345678F", "Javier", "Garcia"));
		int numDespues = c.numeroAlumnos();
		assertEquals(numAntes + 1, numDespues);
	}

	@Test
	void testEstaRegistrado() {
		assertTrue(c.estaRegistrado("12345678Z"));
	}

	@Test
	void testCurso() {
		c = new Curso();
		assertEquals(0, c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(2, c.numeroAlumnos());
	}

}
