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
public interface ConsoleCommand {

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : execute
		Descripcion :
		
		Checkea la cadena de parametros, en 
		el caso de que exista el parametro que
		activa el comando.
		
		Si se detecta el comando se ejecuta.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param params
	void
	
	*
	 */
	
	void execute(final String params);
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    :  Issue 3: Milestone-Release1.0
		Metodo      : setConsoleParameter
		Descripcion :
	
		Establece el ConsolePârameter asociado 
		a este comando. El console parameter es 
		el parser de la linea de parametros de 
		ejecución
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param cp
	void
	
	*
	 */
	
	void setConsoleParameter(final ConsoleParameter cp);
	
}
