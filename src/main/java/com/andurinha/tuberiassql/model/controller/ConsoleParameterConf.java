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
package com.andurinha.tuberiassql.model.controller;

import com.andurinha.tuberiassql.model.ModelBase;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 3: Milestone-Release1.0
	Clase       : 
	Descripcion :
	
	Contiene las propiedades de configuracion de 
	parametro de la linea de comandos

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public class ConsoleParameterConf implements ModelBase{

	private String prefijo;
	private String prefijoExtendido;
	private Integer numParametros;
	
	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Constructor : com.andurinha.tuberiassql.model.controller
		Descripcion :
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	
	**/
	public ConsoleParameterConf() {
		super();
	}

	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Constructor : com.andurinha.tuberiassql.model.controller
		Descripcion :
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param prefijo
	@param prefijoExtendido
	@param numParametros
	
	**/
	public ConsoleParameterConf(String prefijo, String prefijoExtendido,
			Integer numParametros) {
		super();
		this.prefijo = prefijo;
		this.prefijoExtendido = prefijoExtendido;
		this.numParametros = numParametros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numParametros == null) ? 0 : numParametros.hashCode());
		result = prime * result + ((prefijo == null) ? 0 : prefijo.hashCode());
		result = prime
				* result
				+ ((prefijoExtendido == null) ? 0 : prefijoExtendido.hashCode());
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
		ConsoleParameterConf other = (ConsoleParameterConf) obj;
		if (numParametros == null) {
			if (other.numParametros != null)
				return false;
		} else if (!numParametros.equals(other.numParametros))
			return false;
		if (prefijo == null) {
			if (other.prefijo != null)
				return false;
		} else if (!prefijo.equals(other.prefijo))
			return false;
		if (prefijoExtendido == null) {
			if (other.prefijoExtendido != null)
				return false;
		} else if (!prefijoExtendido.equals(other.prefijoExtendido))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.model.ModelBase#isBeanComplete()
	 */
	@Override
	public Boolean isBeanComplete() {
		Boolean resultado = Boolean.FALSE;
		if (this.numParametros != null
				&& this.prefijo != null && !this.prefijo.isEmpty()
				&& this.prefijoExtendido != null && !this.prefijoExtendido.isEmpty()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(final String prefijo) {
		this.prefijo = prefijo;
	}

	public String getPrefijoExtendido() {
		return prefijoExtendido;
	}

	public void setPrefijoExtendido(final String prefijoExtendido) {
		this.prefijoExtendido = prefijoExtendido;
	}

	public Integer getNumParametros() {
		return numParametros;
	}

	public void setNumParametros(final Integer numParametros) {
		this.numParametros = numParametros;
	}
}
