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
		</PRE>
	
	void
	@param args
	
	 **/
	public static void main(String[] args) {
		Main.cargarContextoSpring();

	}
	
	private static void cargarContextoSpring(){
		Main.context = new ClassPathXmlApplicationContext(PUNTO_ENTRADA_SPRING);
	}

}