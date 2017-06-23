package com.tallerweb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "talle")
public class Talle implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTalle;
	@Column
	private String detalle;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getIdTalle() {
		return idTalle;
	}

	public void setIdTalle(Integer idTalle) {
		this.idTalle = idTalle;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
