package com.tallerweb.model;


import org.hibernate.annotations.*;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idUsuario;

@Column
private String eMail;

@Column(name = "nombre")
	private String nombreYapellido;
@Column
	private Integer dni;
@Column
	private String domicilio;
@Column
	private Integer telefono;
@Column
	private String fechaNacimiento;
@Column
	private String clave;
@Column
	private String clave2;
@Column
	private String tipo = "Usuario";

	@ManyToMany( fetch = FetchType.EAGER, mappedBy="usuario")
	private List<Producto> productos;

	public Usuario() {
	}

	public Usuario(Long idUsuario,String eMail, String nombreYapellido, Integer dni, String domicilio, Integer telefono, String fechaNacimiento, String clave, String clave2) {
		this.idUsuario = idUsuario;
		this.eMail = eMail;
		this.nombreYapellido = nombreYapellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.clave = clave;
		this.clave2 = clave2;

	}

	/*GETTERS Y SETTERS*/
	public String getNombreYapellido() {
		return nombreYapellido;
	}
	public void setNombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getClave2() {
		return clave2;
	}


	public void setClave2(String clave2) {
		this.clave2 = clave2;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
