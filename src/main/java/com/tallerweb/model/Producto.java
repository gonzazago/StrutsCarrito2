package com.tallerweb.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Producto implements Serializable{

/*ATRIBUTOS*/

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;

	@Column
	private String nombreProducto;

	@Column
	private String descripcion;

	@ManyToOne(fetch = FetchType.EAGER)@Cascade(value = CascadeType.ALL)
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	@ManyToOne(fetch = FetchType.EAGER)@Cascade(value = CascadeType.ALL)
	@JoinColumn(name = "idColor")
	private Color color;

	@ManyToOne(fetch = FetchType.EAGER)@Cascade(value = CascadeType.ALL)
	@JoinColumn(name = "idTalle")
	private Talle talle;

	@Column
	private String genero;


	@ManyToMany(fetch = FetchType.EAGER)
	@Cascade(value = CascadeType.ALL)
	@JoinTable(name = "usuarios_productos", joinColumns ={@JoinColumn(name="idProducto",referencedColumnName="idProducto")},
			inverseJoinColumns={@JoinColumn(name="idUsuario",referencedColumnName="idUsuario")})
	private List<Usuario> usuario;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Column
	private Float precio;
	@Column
	private String nombreimagen;

	@Column
	private String novedad;
	@Column
	private Integer stock;
	
	
public Producto() {}

    public Producto(Long idProducto, String nombreProducto, String descripcion, Categoria categoria, Color color, Talle talle, Float precio, String nombreimagen, String novedad, Integer stock, String genero) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.color = color;
        this.talle = talle;
        this.precio = precio;
        this.nombreimagen = nombreimagen;
        this.novedad = novedad;
        this.stock = stock;
        this.genero = genero;
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
}
