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
	Clase       : BufferConf
	Descripcion :

	Define la propiedades del buffer utilizado en la aplicacion
	para mover los datos de una base de datos a otra

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public class BufferConf implements ModelBase{

	/**
	 *  Define el valor de la proiedad del tamanho del buffer
	 *  que indica que no se use buffer
	 */
	private static final Integer NO_BUFFER = Integer.valueOf(-1);

	/**
	 *  Define el tamanho del buffer por defecto.
	 */
	private static final Integer BUFFER_DEFAULT = Integer.valueOf(1000);
	
	private Integer tamanho;
		
	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 1: Crear Estructura del Proyecto
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		Constructor vacio
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	
	**/
	public BufferConf() {
		super();
	}

	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 1: Crear Estructura del Proyecto
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		Se define el tamanho de buffer desado
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param tamanho	: define el tamanho del buffer a utilizar
	@see BufferConf#NO_BUFFER
	**/
	
	public BufferConf(Integer tamanho) {
		super();
		this.tamanho = tamanho;
	}

	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Metodo      : hasBuffer
		Descripcion :
	
		Nos indica con un booleano si en la configuracion del buffer
		se ha definido la utilizacion del buffer
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean			: Boolean.TRUE se utiliza buffer , en caso contrario
					  No se utiliza el buffer
	
	*
	*/
	
	public Boolean hasBuffer(){
		Boolean resultado = Boolean.FALSE;
		if (this.tamanho != null && this.tamanho != NO_BUFFER){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}

	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.model.ModelBase#isBeanComplete()
	 */
	@Override
	public Boolean isBeanComplete() {
		Boolean resultado = Boolean.FALSE;
		if (this.tamanho != null){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
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
		BufferConf other = (BufferConf) obj;
		if (tamanho == null) {
			if (other.tamanho != null)
				return false;
		} else if (!tamanho.equals(other.tamanho))
			return false;
		return true;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(final Integer tamanho) {
		this.tamanho = tamanho;
	}
}
