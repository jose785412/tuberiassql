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
package com.andurinha.tuberiassql.controlador.impl;

import java.util.List;

import com.andurinha.tuberiassql.controlador.ConsoleCommand;
import com.andurinha.tuberiassql.controlador.ConsoleController;

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
public class ConsoleControllerImpl implements ConsoleController {

	private static final String ESPACIO = " ";

	/**
	 * Almacena los parametros con los que se ha lanzado la 
	 * aplicacion
	 */
	private String commandStr;
	
	/**
	 * Almacena la lista de los diferentes comandos que estan
	 * disponibles en la aplicacion
	 */
	private List<ConsoleCommand> comandos;
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Constructor : com.andurinha.tuberiassql.controlador.impl
		Descripcion :
	
		Inicializa la cadena de parametros de consola.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	
	*
	 */
	
	public ConsoleControllerImpl(){
		this.commandStr = new String();
	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : hasComandos
		Descripcion :
	
		Nos indica con un booleano si el controlador
		posee comandos disponibles.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean
	
	*
	 */
	
	public Boolean hasComandos(){
		Boolean resultado = Boolean.FALSE;
		if (this.comandos != null && !comandos.isEmpty()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.controlador.ConsoleController#ejecutaComandos)
	 */
	@Override
	public void ejecutaComandos(String[] cmd) {
		if (cmd != null && cmd.length > 0){
			final StringBuffer params = new StringBuffer();
			for (int i = 0; i < cmd.length ; i++){
				params.append(cmd[i]);
				params.append(ESPACIO);
			}
			this.commandStr = params.toString();
			
			if (this.hasComandos()){
				for (ConsoleCommand cc : this.comandos){
					cc.execute(this.commandStr);
				}
			}
		}	
	}

	public void setComandos(final List<ConsoleCommand> comandos) {
		this.comandos = comandos;
	}
	
	

	
	
}
