package com.tallerweb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name= "categoria")
public class Categoria implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCategoria;
	@Column
	private String Detalle;

	public Categoria(){}


	/*GETTERS Y SETTERS*/

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
