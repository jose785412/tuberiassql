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

import java.util.List;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : 
	Clase       : 
	Descripcion :

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public interface ConsoleParameter {

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0 
		Metodo      : isParamOk
		Descripcion :
		
		Determina si la cadena de texto que se pasa
		por parametro, contiene un parametro como 
		el de la instancia que implementa esta 
		interface.
		
		Parsea la cadena de parametros e identifica
		si se encuentra en la cadena de texto
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param params	: cadena de texto con los parametros
	de ejecucion de la aplicacion
	@return			: Boolean true, si la instancia de 
	parameter consle se encuentra dentro la lista de 
	parametros definidos en el string.
	Boolean
	
	*
	 */
	
	Boolean isParamOk(final String params);
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0 
		Metodo      : getParams
		Descripcion :
	
		Devuelve la lista de parametros asociados 
		al modificador que representa esta clase.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	List<String>
	
	*
	 */
	
	List<String> getParams();


	
}
