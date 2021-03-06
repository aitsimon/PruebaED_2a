package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona p;
	@BeforeEach
	void setUp() {
		p = new Persona("12345678A","Aitor","Simon");
	}

	@Test
	void testPersona() {
	}

	@Test
	void testPersonaStringStringString() {
		Persona p3=new Persona("87654321X","Persona","Per");
		assertEquals("Per",p3.getApellido1());
	}

	@Test
	void testGetDni() {
		AssertEquals("12345678A",p.getDni());
	}

	private void AssertEquals(String string, String dni) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testSetDni() {
		
		//Test con dni valido
		String nuevoDni="12345678D";
		boolean haPasado=false;
		try {
			p.setDni(nuevoDni);
			assertEquals(nuevoDni,p.getDni());
		} catch (Exception e) {
			haPasado=true;
		}
		assertFalse(haPasado);
		//Test con dni invalido
		Persona p2= new Persona("12345678C","Alberto","Martinez");
		String nuevoDniSinLetra="123456789";
		boolean haPasado2=false;
		try {
			p2.setDni(nuevoDniSinLetra);
		}catch(Exception e){
			haPasado2=true;
		}
		assertTrue(haPasado2);
	}

	@Test
	void testGetNombre() {
		assertEquals("Aitor", p.getNombre());
	}

	@Test
	void testSetNombre() {
		String nuevoNombre="Carlos";
		p.setNombre(nuevoNombre);
		assertEquals(nuevoNombre,p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Simon",p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		String nuevoApellido="Munoz";
		p.setApellido1(nuevoApellido);
		assertEquals("Munoz",p.getApellido1());
	}
}
