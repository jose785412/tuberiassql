/**
 	Tuberias SQL : Software de terminal para mover datos entre bases de datos
    Copyright (C) 2012  bris2376@gmail.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 
 **/
package com.andurinha.tuberiassql;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 1: Crear Estructura del Proyecto
	Clase       : Main
	Descripcion :

	Punto de entrada de la aplicacion.
	Carga configuracion.
	Carga contexto de Spring.
	Parsea parametros de entrada.

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


*
 */
public class Main {

	private static final String PUNTO_ENTRADA_SPRING = "spring/spring-tuberias.xml";
	private static final String MSG_BIENVENIDA = "/mensajes/bienvenida.txt";
	private static ApplicationContext context;
	
	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 1: Crear Estructura del Proyecto
		Metodo      : main
		Descripcion :
	
		Punto de entrada de la aplicacion
	
	    Fecha       : 22/01/2012
		Autor       : bris2376@gmail.com
		
		ID_TAREA	: Creación del mensaje de Bienvenida de la aplicacion
		Descripcion :
		
		Mostrar el mensaje de bienvenida de la aplicacion
		
		Fecha		: 22/01/2012
		Autor		: bris2376@gmail.com
		
		</PRE>
	
	void
	@param args
	
	 **/
	public static void main(String[] args) {
		Main.mostrarMsgBienVenida();
		Main.cargarContextoSpring();

	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 1: Crear Estructura del Proyecto
		Metodo      : cargarContextoSpring
		Descripcion :
	
		Carga el contexto de spring en la aplicacion
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	void
	
	*
	*/
	
	private static void cargarContextoSpring(){
		Main.context = new ClassPathXmlApplicationContext(PUNTO_ENTRADA_SPRING);
	}

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 2: Creación del mensaje de Bienvenida de la aplicacion
		Metodo      : mostrarMsgBienVenida
		Descripcion :
	
		Escupe por la salida estandard el mensaje que esta contenido en el 
		fichrero de bienvenida definido en {@link Main#MSG_BIENVENIDA}
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	void
	
	*
	 */
	
	private static void mostrarMsgBienVenida(){
		try {
			final InputStream is = String.class.getResourceAsStream(MSG_BIENVENIDA);
			final BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
			Boolean centinela = Boolean.TRUE;
			while (centinela){
				String linea;
				linea = buffer.readLine();
				if (linea == null){
					centinela = Boolean.FALSE;
				} else {
					System.out.println(linea);
				}
			}
		} catch (IOException e) {					
				e.printStackTrace();
		}		
		
	}
	
	public static ApplicationContext getContext() {
		return context;
	}
	
	

}
