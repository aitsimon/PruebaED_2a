package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * 
 * Definicion de la clase Persona
 * 
 * @author Aitor
 * @version 1.0
 * @since 3.0
 *
 */
public class Persona {
	/**
	 * Dni unico e identificador de la Persona
	 */
	private String dni;
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Primer apellido de la persona
	 */
	private String apellido1;

	public Persona() {
	}

	/**
	 * Constructor de una Persona a partir de su dni, apellido y nombre
	 * 
	 * @param dni       Dni de la Persona
	 * @param nombre    Nombre de la Persona
	 * @param apellido1 Primer apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * 
	 * @return Devuelve una cadena que contiene el dni de la persona en cuestion
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo que permite la modificacion del dni de una persona pasando por
	 * parametro el dni nuevo que se le quiere instaurar. Este metodo comprueba que
	 * el dni nuevo que se quiere implantar tiene un formato valido comprobando que
	 * el ultimo caracter de la cadena es una letra. En caso de que el dni pasado
	 * por parametro no tenga un formnato valido lanza y resuelve una excepcion que
	 * muestra por pantalla el siguiente mensaje "El ultimo caracter introducido no
	 * es una letra"
	 * 
	 * @param dni Dni nuevo que se le quiere imponer a la Persona
	 * @throws Exception Excepcion que se lanza en caso de que el dni introducido
	 *                   por parametro no sea valido
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Metodo que nos devuelve en formato cadena el nombre de una determinada
	 * Persona
	 * 
	 * @return Devuelve el nombre de la Persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que nos permite modificar el nombre de una Persona pasando por
	 * parametro el nuevo nombre en formato cadena
	 * 
	 * @param nombre Nombre nuevo que se le quiere instanciar a la Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el apellido de una Persona en cuestion
	 * 
	 * @return Devuelve el apellido de una persona en cuestion
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Metodo que nos permite modificar el apellido de una Persona, pasando por
	 * parametro el nuevo apellido que se quiere instanciar
	 * 
	 * @param apellido1 Nuevo apellido que se quiere adjudicar a la Persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
