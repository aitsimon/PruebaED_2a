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
		c=new Curso();
		Persona p1=new Persona("12345678A","Aitor","Simon");
		Persona p2=new Persona("12345678Z","Alberto","Martinez");
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEliminarAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		c=new Curso();
		assertEquals(0,c.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(2,c.numeroAlumnos());
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}