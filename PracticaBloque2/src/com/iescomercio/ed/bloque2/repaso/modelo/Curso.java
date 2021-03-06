package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * Definicion de la clase Curso que se contiene un conjunto de objetos de la clase Persona
 *
 * 
 * @author Aitor
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
	/**
	 * Lista de objetos de la clase Persona que componen la clase Curso
	 */
	private List<Persona> listaAlumnos;

	/**
	 * Metodo que nos permite eliminar un alumno del listado de alumnos. El listado
	 * de alumnos es una lista de objetos de la clase Persona. Se debera introducir
	 * por parametro una cadena que contenga el dni de la persona que se quiere
	 * eliminar. Se considerara que el dni es correcto cuando la longitud del mismo
	 * sea de 9 caracteres y por lo tanto se ejecutara el metodo. Si el dni tiene un
	 * numero de caracteres es diferente a 9, lanzara y manejara una excepcion que
	 * nos mostrara el siguiente mensaje por pantalla: "El dni no tiene la longitud
	 * adecuada"
	 * 
	 * @param dni Dni del objeto Persona que se quiere eliminar de la listaAlumnos
	 * @throws Exception Mensaje de error que nos mostrara el metodo en caso de que
	 *                   la longitud del dni introducido sea diferente de 9
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Metodo que nos permite aniadir una persona a la listaAlumnos del Curso. La
	 * persona se introducira por parametro.
	 * 
	 * @param p Persona a aniadir.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Metodo que nos permitira comprobar si un alumno esta o no registrado. Se le
	 * introducira un dni de la clase Persona por parametro. Si esta persona esta
	 * matriculada devolvera "true", sino lo esta devolvera "false"
	 * 
	 * @param dni Dni de la Persona que se quiere comprobar si esta registrada
	 * @return true/false en caso de si la persona esta o no registrada en el Curso.
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Constructor de la clase Curso. Incializa el ArrayList donde se almacenan los
	 * objetos de la clase Persona que componen el Curso. Sin parametros
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Metodo que devuelve un entero que muestra la cantidad de alumnos del curso.
	 * 
	 * 
	 * @return Devuelve un Integer que refleja la cantidad de Personas en la listaAlumnos
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
