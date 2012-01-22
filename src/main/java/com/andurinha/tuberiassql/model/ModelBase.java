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
package com.andurinha.tuberiassql.model;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 1: Crear Estructura del Proyecto
	Clase       : ModelBase
	Descripcion :

	Define los metodos comunes que han de implementar todos
	los beans del modelo de esta aplicacion

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public interface ModelBase {

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 1: Crear Estructura del Proyecto
		Metodo      : isBeanComplete
		Descripcion :
	
		Nos indica con un booleano si el bean de datos 
		esta correctamente rellenado. Y no tiene ninguna
		propiedad a null
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean
	
	*
	 */
	
	Boolean isBeanComplete();
	
}
