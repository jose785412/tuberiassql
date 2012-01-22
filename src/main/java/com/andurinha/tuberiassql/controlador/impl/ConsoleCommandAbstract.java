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
import com.andurinha.tuberiassql.controlador.ConsoleParameter;

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
public abstract class ConsoleCommandAbstract implements ConsoleCommand{

	private ConsoleParameter consoleParameter;
		
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : ejecutar
		Descripcion :
	
		Metodo que se ejecuta cuando el parseo de la
		linea de comandos ha dado un resultado positivo
		
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param params   : la lista de paramatros del comando
	a ejecutar.
	void
	
	*
	 */
	
	protected abstract void ejecutar(final List<String> params);
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Metodo      : validarParametros
		Descripcion :
	
		Checkea que los parametros de entrada del metodo ejecutar
		son validos para este comando
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param params
	@return
	Boolean
	
	*
	 */
	
	protected abstract Boolean validarParametros(final List<String> params);
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : hasParametros
		Descripcion :
	
		Determina con un booleano si el comando posee
		parametros.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean
	
	*
	 */
	
	protected Boolean hasParametros(){
		Boolean resultado = Boolean.FALSE;
		if (this.consoleParameter != null ){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	@Override
	public void execute(final String parametros){
		if (this.hasParametros()
				&& this.consoleParameter.isParamOk(parametros)){
			final List<String> ps = this.consoleParameter.getParams();
			if (this.validarParametros(ps)){
				this.ejecutar(ps);
			}
			
		}
	}
	
	@Override
	public void setConsoleParameter(final ConsoleParameter consoleParameter) {
		this.consoleParameter = consoleParameter;
	}
	
	
	
}
