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

import java.util.Locale;

import com.andurinha.tuberiassql.model.ModelBase;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 1: Crear Estructura del Proyecto
	Clase       : 
	Descripcion :
	
	Bean que almacena la informacion del fichero de properties
	de la aplicacion.
	
	configuracion.properties

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public class Configuracion implements ModelBase{

	private Locale locale;
	private ScriptsConf scripts;
	private BufferConf buffer;
	
	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	
	**/
	public Configuracion() {
		super();		
	}

	/**
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : 
		Constructor : com.andurinha.tuberiassql.model.configuracion
		Descripcion :
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param locale
	@param scripts
	@param buffer
	
	**/
	public Configuracion(Locale locale, ScriptsConf scripts, BufferConf buffer) {
		super();
		this.locale = locale;
		this.scripts = scripts;
		this.buffer = buffer;
	}

	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.model.ModelBase#isBeanComplete()
	 */
	@Override
	public Boolean isBeanComplete() {
		Boolean resultado = Boolean.TRUE;
		if (this.locale != null 
				&& this.scripts != null && this.scripts.isBeanComplete()
				&& this.buffer != null && this.buffer.isBeanComplete()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buffer == null) ? 0 : buffer.hashCode());
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((scripts == null) ? 0 : scripts.hashCode());
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
		Configuracion other = (Configuracion) obj;
		if (buffer == null) {
			if (other.buffer != null)
				return false;
		} else if (!buffer.equals(other.buffer))
			return false;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (scripts == null) {
			if (other.scripts != null)
				return false;
		} else if (!scripts.equals(other.scripts))
			return false;
		return true;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(final Locale locale) {
		this.locale = locale;
	}

	public ScriptsConf getScripts() {
		return scripts;
	}

	public void setScripts(final ScriptsConf scripts) {
		this.scripts = scripts;
	}

	public BufferConf getBuffer() {
		return buffer;
	}

	public void setBuffer(final BufferConf buffer) {
		this.buffer = buffer;
	}

	
}
