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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.andurinha.tuberiassql.controlador.ConsoleParameter;
import com.andurinha.tuberiassql.model.controller.ConsoleParameterConf;

/**
	<PRE>
	Proyecto    : Tuberias SQL
	Codigo	    : tuberiassql 
	ID_TAREA    : Issue 3: Milestone-Release1.0
	Clase       : 
	Descripcion :

	Clase que se encarga de parsear la linea de parametros
	de ejecucion de la aplicacion . Para determinar
	si existe en la cadena de parametros el parametro que
	extiende esta clase.
	
	El formato de la cadena de parametros cumple con esta 
	especificacion.
	
	Formato reducido.
	
	-<modificador> [param1 | param2 | param3]
	
	ejemplo:
	
	-c 12 casa
	
	--unir-casa 12 casa

	</PRE>
	@date       : 22/01/2012
	@author     : bris2376@gmail.com


 **/
public class ConsoleParameterImpl implements ConsoleParameter{

	/**
	 * Define cual es la cadena de texto que define un modificador
	 * en la linea de parametros
	 */
	private static final String PREFIJO_MODIFICADOR = "-";
	/**
	 * Define cual es la cadena de texto que define un modificador
	 * extendido en la linea de parametros.
	 */
	private static final String PREFIJO_MODIFICADOR_EXTENDIDO = "--";
	
	/**
	 * Contiene la configuracion del parametro, prefijo, prefijo
	 * extendido y numero de parametros.
	 */
	private ConsoleParameterConf conf;
	
	/**
	 * Contiene los valores de los parametros de este modificador
	 * Se carga el valor cuando se parsea la cadena de texto.
	 */
	protected List<String> params;
	
	/**
	 * Encargado de parsear la linea de parametros
	 */
	private Matcher matcher;
	
	/**
	 * Encargado de embeber la expresion regular.
	 */
	private Pattern patron;
	
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : hasParametros
		Descripcion :
	
		Checkea si el parametro tiene los valores
		de los parametros cargados en memoria
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean
	
	*
	 */
	
	private Boolean hasParametros(){
		Boolean resultado = Boolean.FALSE;
		if (this.params != null && !this.params.isEmpty()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : hasConfiguracion
		Descripcion :
	
		Checkea si el parametro tiene cargada su 
		configuracion en memoria
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	Boolean
	
	*
	 */
	
	private Boolean hasConfiguracion(){
		Boolean resultado = Boolean.FALSE;
		if (this.conf != null && this.conf.isBeanComplete()){
			resultado = Boolean.TRUE;
		}
		return resultado;
	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : contToexprReg
		Descripcion :
	
		Transforma el bean de configuracion del parametro
		en una cadena de texto, que representa la expresion
		regular que determina si existe el parametro 
		en la cadena de texto con los parametros de ejecucion
		de la aplicacion.
		
		Devuelve un lista con las posibles expresiones regulares
		que pueden parsear la cadena.
		
		Un string para experesion regular con el modificador normal
		y otro String para expresion regular con el modificador
		extendido
	
		(([-]?)([modificador]?)([parametros]*))
		
		ejemplo
		
		prefijo > c
		prefijo extendido > conf
		num parametros > 4
		
		salida1 : (([-]?)([c]?)([ ]*[a-z]*[0-9]*[]?)?4) 
		
		salida2 : (([--]?)([conf]?)([ ]*[a-z]*[0-9]*[]?)?4)
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@return
	String
	
	*
	 */
	
	private List<String> contToexprReg(){
		final List<String> resultado = new ArrayList<String>();
		
		resultado.add(this.getExpresion(PREFIJO_MODIFICADOR, 
				this.conf.getPrefijo(), 
				this.conf.getNumParametros()));
		resultado.add(this.getExpresion(PREFIJO_MODIFICADOR_EXTENDIDO, 
				this.conf.getPrefijoExtendido(), 
				this.conf.getNumParametros()));
		
		return resultado;
	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : getExpresion
		Descripcion :
	
		Devuelve el siguiente string , si no tiene 
		ningun parametro a null
		
		(([marcaInicio]?)([marcaModificador]?)([ ]*[a-z]*[0-9]*[]?)?numParametros)
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param marcaInicio
	@param marcaModificador
	@param numparametros
	@return
	String
	
	*
	 */
	
	private String getExpresion(final String marcaInicio, 
			final String marcaModificador, 
			final Integer numparametros){
		final StringBuffer resultado = new StringBuffer();
		if (marcaInicio != null && marcaModificador != null
				&& numparametros != null){
			resultado.append("([\\p{Punct}");
			resultado.append(marcaInicio);
			resultado.append("");
			resultado.append(marcaModificador);
			resultado.append("\\p{Space}]{1})");
//			resultado.append("([*\\p{Space}]");
//			resultado.append("{");
//			resultado.append(numparametros);
//			resultado.append("})[\\p{Punct}-]*?");			
		}
		
		return resultado.toString();
	}
	
	/**
	 * 
		<PRE>
		Proyecto    : Tuberias SQL
		Codigo	    : tuberiassql 
		ID_TAREA    : Issue 3: Milestone-Release1.0
		Metodo      : parseParams
		Descripcion :
	
		Para una expresion regular , parsea la cadena
		de parametros y en el caso de que coincida
		devuelve la lista de los parametros del modificador
		examindado.
	
		</PRE>
		@date       : 22/01/2012
		@author     : bris2376@gmail.com
	
	@param exprReg	: expresion regular utilizada para filtrar la cadena
	@param params   : cadena de texto con los parametros de la ejecucion 
	de la aplicacion
	@return			: la lista de parametros que contiene el modificador
	que extiende de esta clase. En el caso que los hubiera.
	List<String>
	
	*
	 */
	
	private List<String> parseParams(final String exprReg, final String params){
		final List<String> resultado= new ArrayList<String>();
		if (exprReg != null && !exprReg.isEmpty()
				&& params != null && !params.isEmpty()){
			this.patron = Pattern.compile(exprReg);
			this.matcher = this.patron.matcher(params);
		    while(matcher.find()){
		       for (int i = 0 ; i <= matcher.groupCount() ; i++){
		    	   resultado.add(matcher.group(i));
		       }			                  
		    }          
		}
		
		return resultado;
	}
	
	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.controlador.ConsoleParameter#isParamOk(java.lang.String)
	 */
	@Override
	public Boolean isParamOk(String params) {
		Boolean resultado = Boolean.FALSE;
		if (params != null && !params.isEmpty() && this.hasConfiguracion()){
			final List<String> eprex = this.contToexprReg();
			if (eprex != null && !eprex.isEmpty()){
				this.params = new ArrayList<String>();
				for (String e : eprex){
					this.params.addAll(this.parseParams(e,params));
				}
				if (this.hasParametros()){
					resultado = Boolean.TRUE;
				}
			}
		}
		return resultado;
	}

	/* (non-Javadoc)
	 * @see com.andurinha.tuberiassql.controlador.ConsoleParameter#getParams()
	 */
	@Override
	public List<String> getParams() {
		return this.params;
	}

	public void setConf(final ConsoleParameterConf conf) {
		this.conf = conf;
	}
	
}
