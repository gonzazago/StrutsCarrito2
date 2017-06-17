package com.tallerweb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Color implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	private String color;
	
	@OneToMany (mappedBy="color", cascade=CascadeType.ALL)
	private List <Producto> productos = new ArrayList <Producto> ();
	
	public Color(String color) {
		this.color=color;
	}
	
	public Color(){}

	/*GETTERS Y SETTERS*/

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	/*EQUALS Y HASHCODE*/

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Color other = (Color) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}


	/*SOBREESCRITURA DE METODO TOSTRING*/
	@Override
	public String toString() {
		color.toString();
		return color;
	}
}
