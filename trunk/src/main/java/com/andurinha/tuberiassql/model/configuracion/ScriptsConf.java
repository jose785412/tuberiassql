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
package com.andurinha.tuberiassql.model.configuracion;

import com.andurinha.tuberiassql.model.ModelBase;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 1: Crear Estructura del Proyecto
	Clase       : ScriptsConf
	Descripcion :

	Almacena la configuracion de los scripts SQL que 
	ejecutara la aplicacion.

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public class ScriptsConf implements ModelBase{

	private String origen;
	private String destino;
	
	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		Constructor vacio
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	
	**/
	public ScriptsConf() {
		super();
	}

	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		Inicializa los valores de los scripts de origen y destino
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param origen
	@param destino
	
	**/
	public ScriptsConf(String origen, String destino) {
		super();
		this.origen = origen;
		this.destino = destino;
	}

	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.model.ModelBase#isBeanComplete()
	 */
	@Override
	public Boolean isBeanComplete() {
		Boolean resultado = Boolean.FALSE;
		if (this.origen != null && !origen.isEmpty()
				&& this.destino != null && !destino.isEmpty()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
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
		ScriptsConf other = (ScriptsConf) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (origen == null) {
			if (other.origen != null)
				return false;
		} else if (!origen.equals(other.origen))
			return false;
		return true;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(final String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(final String destino) {
		this.destino = destino;
	}
	
	
	
}
