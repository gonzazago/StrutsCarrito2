package com.tallerweb.model;

import java.io.Serializable;

import javax.persistence.*;



@Entity
public class Producto implements Comparable<Producto>, Serializable{ 

/*ATRIBUTOS*/

	private static final long serialVersionUID = 1L;


	@Id
	private Long id;

	private String nombreProducto;

	private String descripcion;

	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn
	private Categoria categoria;

	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn
	private Color color;

	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn
	private Talle talle;

	private Float precio;



	private String nombreimagen;

	private String novedad;
	
	private Integer stock;
	
	
public Producto() {}

	/*GETTERS Y SETTERS*/
	public Long getId() {
		return id;
	}
	public Long setId(Long id) {
		return this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Talle getTalle() {
		return talle;
	}
	public void setTalle(Talle talle) {
		this.talle = talle;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public String getNombreimagen() {
		return nombreimagen;
	}
	public void setNombreimagen(String nombreimagen) {
		this.nombreimagen = nombreimagen;
	}
	public String getNovedad() {
		return novedad;
	}
	public void setNovedad(String novedad) {
		this.novedad = novedad;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*EQUALS Y HASHCODE*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Producto other = (Producto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/*COMPARE TO*/
	@Override
	public int compareTo(Producto o) {
		return this.id.compareTo(o.id);
	}

}
