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
package com.andurinha.tuberiassql.controlador;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 3: Milestone-Release1.0
	Clase       : 
	Descripcion :

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public interface ConsoleController {

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : ejecutaComandos
		Descripcion :
		
		Settea al controlador la linea ejecutada
		en la terminal de comandos.
		
		EL controlador sera el encargado, de 
		parsear la linea de texto cmd, y lanzar
		la ejecución de los diferentes procesos
		que se especifiquen en el comando
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param cmd		: string que contiene los 
	parametros con los que se ejecuto esta 
	aplicacion
	void
	
	*
	 */
	
	void ejecutaComandos(final String[] cmd);
}
