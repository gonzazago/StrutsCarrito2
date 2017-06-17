package com.tallerweb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Talle implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	private String talle;
	
	@OneToMany (mappedBy="talle", cascade=CascadeType.ALL)
	private List <Producto> productos = new ArrayList <Producto> ();
	
	public Talle(String talle) {
		this.talle=talle;
	}	
	
	public Talle(){}

	/*GETTERS Y SETTERS*/

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	/*EQUALS Y HASHCODE*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((talle == null) ? 0 : talle.hashCode());
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
		Talle other = (Talle) obj;
		if (talle == null) {
			if (other.talle != null)
				return false;
		} else if (!talle.equals(other.talle))
			return false;
		return true;
	}


	/*SOBREESCRITURA DE METODO TOSTRING*/
	@Override
	public String toString() {
		talle.toString();
		return talle;
	}
}
